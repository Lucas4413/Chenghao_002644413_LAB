package UI;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import Model.Customer;
import Model.Package;
import Model.Product;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.annotation.Target;
import java.awt.event.ActionEvent;

public class Read extends JPanel {
	private JTextField tfPackageID;
	private JTextField tfPackageWeight;
	private JTextField tfProductID;
	private JTextField tfProductName;
	private JTextField tfProductPrice;
	private JTextField tfFullName;
	private JTextField tfCustomerID;

	/**
	 * Create the panel.
	 */
	public Read(Package package1) {
		setLayout(null);
		
		Package package2 = package1;
		ArrayList<Product> products = package2.getProducts();
		Customer customer = package2.getCustomer();
		Product product = products.get(0);
		
		JLabel lblPreviewYourPackage = new JLabel("Preview Your Package");
		lblPreviewYourPackage.setBounds(171, 23, 133, 15);
		add(lblPreviewYourPackage);
		
		JLabel lbPackageID = new JLabel("Package ID");
		lbPackageID.setBounds(39, 61, 72, 15);
		add(lbPackageID);
		
		JLabel lbPackageWeight = new JLabel("Package Weight");
		lbPackageWeight.setBounds(39, 96, 121, 15);
		add(lbPackageWeight);
		
		JLabel lbProductID = new JLabel("Product ID");
		lbProductID.setBounds(39, 236, 72, 15);
		add(lbProductID);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setBounds(39, 272, 92, 15);
		add(lblProductName);
		
		JLabel lbProductPeice = new JLabel("Product Price");
		lbProductPeice.setBounds(39, 313, 92, 15);
		add(lbProductPeice);
		
		JLabel lbFullName = new JLabel("Full Name");
		lbFullName.setBounds(39, 127, 72, 15);
		add(lbFullName);
		
		JLabel lbCustomerID = new JLabel("Customer ID");
		lbCustomerID.setBounds(39, 162, 92, 15);
		add(lbCustomerID);
		
		tfPackageID = new JTextField();
		tfPackageID.setColumns(10);
		tfPackageID.setBounds(181, 55, 200, 21);
		add(tfPackageID);
		
		tfPackageWeight = new JTextField();
		tfPackageWeight.setColumns(10);
		tfPackageWeight.setBounds(181, 90, 200, 21);
		add(tfPackageWeight);
		
		tfProductID = new JTextField();
		tfProductID.setColumns(10);
		tfProductID.setBounds(181, 230, 200, 21);
		add(tfProductID);
		
		tfProductName = new JTextField();
		tfProductName.setColumns(10);
		tfProductName.setBounds(181, 266, 200, 21);
		add(tfProductName);
		
		tfProductPrice = new JTextField();
		tfProductPrice.setColumns(10);
		tfProductPrice.setBounds(181, 307, 200, 21);
		add(tfProductPrice);
		
		tfFullName = new JTextField();
		tfFullName.setColumns(10);
		tfFullName.setBounds(181, 121, 200, 21);
		add(tfFullName);
		
		tfCustomerID = new JTextField();
		tfCustomerID.setColumns(10);
		tfCustomerID.setBounds(181, 156, 200, 21);
		add(tfCustomerID);
		
		
		tfCustomerID.setText(customer.getCustomerID());
		tfFullName.setText(customer.getFullName());
		tfPackageID.setText(package2.getID());
		tfPackageWeight.setText(""+package2.getWeight());
		tfProductID.setText(product.getID());
		tfProductName.setText(product.getName());
		tfProductPrice.setText(""+product.getPrice());
		
		Choice choice = new Choice();
		choice.setBounds(39, 199, 72, 21);
		add(choice);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Product> ps = package1.getProducts();
				String target = choice.getSelectedItem();
				for (Product p:ps) {
					if(p.getID()==target) {
						tfProductID.setText(p.getID());
						tfProductPrice.setText(""+p.getPrice()); 
						tfProductName.setText(p.getName());
						break;
					}
				}
			}
		});
		btnShow.setBounds(137, 199, 93, 23);
		add(btnShow);
		
		products.forEach(p->{
			choice.add(p.getID());
		});
	}
}
