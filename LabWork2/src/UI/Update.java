package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Model.Customer;
import Model.Package;
import Model.Product;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JMenuItem;
import java.awt.Choice;

public class Update extends JPanel {
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
	public Update(Package package1) {
		setLayout(null);
		
		Package package2 = package1;
		ArrayList<Product> products = package2.getProducts();
		Customer customer = package2.getCustomer();
		Product product = products.get(0);
		
		JLabel lblUpdateYourPackage = new JLabel("Update Your Package");
		lblUpdateYourPackage.setBounds(171, 23, 133, 15);
		add(lblUpdateYourPackage);
		
		JLabel lbPackageID = new JLabel("Package ID");
		lbPackageID.setBounds(39, 61, 72, 15);
		add(lbPackageID);
		
		JLabel lbPackageWeight = new JLabel("Package Weight");
		lbPackageWeight.setBounds(39, 96, 117, 15);
		add(lbPackageWeight);
		
		JLabel lbProductID = new JLabel("Product ID");
		lbProductID.setBounds(39, 237, 72, 15);
		add(lbProductID);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setBounds(39, 273, 92, 15);
		add(lblProductName);
		
		JLabel lbProductPeice = new JLabel("Product Price");
		lbProductPeice.setBounds(39, 314, 92, 15);
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
		tfProductID.setBounds(181, 231, 200, 21);
		add(tfProductID);
		
		tfProductName = new JTextField();
		tfProductName.setColumns(10);
		tfProductName.setBounds(181, 267, 200, 21);
		add(tfProductName);
		
		tfProductPrice = new JTextField();
		tfProductPrice.setColumns(10);
		tfProductPrice.setBounds(181, 308, 200, 21);
		add(tfProductPrice);
		
		tfFullName = new JTextField();
		tfFullName.setColumns(10);
		tfFullName.setBounds(181, 121, 200, 21);
		add(tfFullName);
		
		tfCustomerID = new JTextField();
		tfCustomerID.setColumns(10);
		tfCustomerID.setBounds(181, 156, 200, 21);
		add(tfCustomerID);
		
		Choice choice = new Choice();
		choice.setBounds(39, 202, 72, 21);
		add(choice);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					float weight = Float.parseFloat(tfPackageWeight.getText());
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "The package weight should be a valid number!");
					return;
				}
				try {
					float price = Float.parseFloat(tfProductPrice.getText());
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "The product Price should be a valid number!");
					return;
				}
				
				float weight = Float.parseFloat(tfPackageWeight.getText());
				float price = Float.parseFloat(tfProductPrice.getText());
				
				if(tfPackageID.getText() == null || tfPackageID.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "The Package ID is not proper!");
					return;
				}else if(tfFullName.getText() == null || tfFullName.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "The Name entered is not proper!");
					return;
				}else if(tfCustomerID.getText() == null || tfCustomerID.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "The Customer ID is not correct!");
					return;
				}else if(tfProductID.getText() == null || tfProductID.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "The Product ID is not proper!");
					return;
				}else if(tfProductName.getText() == null || tfProductName.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "The Product Name is not proper!");
					return;
				}else if(weight<0) {
					JOptionPane.showMessageDialog(null, "The Package weight should be positive!");
					return;
				}else if(price<0) {
					JOptionPane.showMessageDialog(null, "The Product Price should be positive!");
					return;
				}
				
				package1.setID(tfPackageID.getText());
				package1.setWeight(Float.parseFloat(tfPackageWeight.getText()));
				package1.setCustomer(tfFullName.getText(), tfCustomerID.getText());
				package1.setProduct(tfProductID.getText(), tfProductName.getText(), Float.parseFloat(tfProductPrice.getText()));
				String target = choice.getSelectedItem();
				for (Product p:products) {
					if(p.getID()==target) {
						int idx = products.indexOf(p);
						p.setID(tfProductID.getText());
						p.setPrice(Float.parseFloat(tfProductPrice.getText())); 
						p.setName(tfProductName.getText());
						products.set(idx, p);
						break;
					}
				}
				
				JOptionPane.showMessageDialog(null, "You've successfully update the package!");
			}
		});
		btnUpdate.setBounds(171, 352, 93, 23);
		add(btnUpdate);

		tfCustomerID.setText(customer.getCustomerID());
		tfFullName.setText(customer.getFullName());
		tfPackageID.setText(package2.getID());
		tfPackageWeight.setText(""+package2.getWeight());
		tfProductID.setText(product.getID());
		tfProductName.setText(product.getName());
		tfProductPrice.setText(""+product.getPrice());
		
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
		btnShow.setBounds(137, 202, 93, 23);
		add(btnShow);
		
		products.forEach(p->{
			choice.add(p.getID());
		});
	}
}
