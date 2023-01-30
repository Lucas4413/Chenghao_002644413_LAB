package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import Model.Package;
import Model.Product;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Create extends JPanel {
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
	public Create(Package package1) {
		setLayout(null);
		
		JLabel lbtitle = new JLabel("Create Your Package");
		lbtitle.setBounds(171, 23, 133, 15);
		add(lbtitle);
		
		JLabel lbPackageID = new JLabel("Package ID");
		lbPackageID.setBounds(39, 61, 72, 15);
		add(lbPackageID);
		
		JLabel lbPackageWeight = new JLabel("Package Weight");
		lbPackageWeight.setBounds(39, 96, 113, 15);
		add(lbPackageWeight);
		
		JLabel lbProductID = new JLabel("Product ID");
		lbProductID.setBounds(39, 216, 72, 15);
		add(lbProductID);
		
		JLabel lbProductName = new JLabel("Product Name");
		lbProductName.setBounds(39, 252, 92, 15);
		add(lbProductName);
		
		JLabel lbProductPeice = new JLabel("Product Price");
		lbProductPeice.setBounds(39, 283, 92, 15);
		add(lbProductPeice);
		
		JLabel lbFullName = new JLabel("Full Name");
		lbFullName.setBounds(39, 127, 72, 15);
		add(lbFullName);
		
		JLabel lbCustomerID = new JLabel("Customer ID");
		lbCustomerID.setBounds(39, 162, 92, 15);
		add(lbCustomerID);
		
		tfPackageID = new JTextField();
		tfPackageID.setBounds(181, 55, 200, 21);
		add(tfPackageID);
		tfPackageID.setColumns(10);
		
		tfPackageWeight = new JTextField();
		tfPackageWeight.setBounds(181, 90, 200, 21);
		add(tfPackageWeight);
		tfPackageWeight.setColumns(10);
		
		tfProductID = new JTextField();
		tfProductID.setBounds(181, 213, 200, 21);
		add(tfProductID);
		tfProductID.setColumns(10);
		
		tfProductName = new JTextField();
		tfProductName.setBounds(181, 246, 200, 21);
		add(tfProductName);
		tfProductName.setColumns(10);
		
		tfProductPrice = new JTextField();
		tfProductPrice.setBounds(181, 277, 200, 21);
		add(tfProductPrice);
		tfProductPrice.setColumns(10);
		
		tfFullName = new JTextField();
		tfFullName.setBounds(181, 121, 200, 21);
		add(tfFullName);
		tfFullName.setColumns(10);
		
		tfCustomerID = new JTextField();
		tfCustomerID.setBounds(181, 156, 200, 21);
		add(tfCustomerID);
		tfCustomerID.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
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
				Product p = new Product();
				p.setID(tfProductID.getText());
				p.setName(tfProductName.getText());
				p.setPrice(Float.parseFloat(tfProductPrice.getText()));
				package1.Add(p);
				JOptionPane.showMessageDialog(null, "You've successfully created a package!");
			}
		});
		btnCreate.setBounds(266, 324, 93, 23);
		add(btnCreate);
		
		JButton btnAdd = new JButton("Add Product");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (package1.getID()==null||package1.getID().length()==0) {
					JOptionPane.showMessageDialog(null, "Please create a package first!");
					return;
				}
				
				String productID = tfProductID.getText();
				for(Product p:package1.getProducts()) {
					if(productID.equals(p.getID())) {
						JOptionPane.showMessageDialog(null, "The Product ID should be unique!");
						return;
					}
				}
				
				try {
					float price = Float.parseFloat(tfProductPrice.getText());
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "The product Price should be a valid number!");
					return;
				}
				
				float price = Float.parseFloat(tfProductPrice.getText());
				
				if(tfProductID.getText() == null || tfProductID.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "The Product ID is not proper!");
					return;
				}else if(tfProductName.getText() == null || tfProductName.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "The Product Name is not proper!");
					return;
				}
				
				package1.setProduct(tfProductID.getText(), tfProductName.getText(), Float.parseFloat(tfProductPrice.getText()));
				Product p = new Product();
				p.setID(tfProductID.getText());
				p.setName(tfProductName.getText());
				p.setPrice(price);
				package1.Add(p);
				JOptionPane.showMessageDialog(null, "You've successfully added a new product!");
			}
		});
		btnAdd.setBounds(86, 324, 113, 23);
		add(btnAdd);
		
		JLabel lblNewLabel = new JLabel("Product Detail:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 191, 142, 15);
		add(lblNewLabel);

	}
}
