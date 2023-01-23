package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Model.Address;
import Model.Contact;
import Model.Person;

import java.awt.Font;

public class Lab1Frame extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfFirstName;
	private JTextField tfLastName;
	private JTextField tfCollegeName;
	private JTextField tfphone;
	private JTextField tfemail;
	private JTextField tfStreetName;
	private JTextField tfAptNo;
	private JTextField tfCity;
	private JTextField tfZip;
	private Person person = new Person();
	private JTextField tfphone_personal;
	private JTextField tfemail_personal;
	private JTextField tfStreetName_current;
	private JTextField tfAptNo_current;
	private JTextField tfCity_current;
	private JTextField tfZip_current;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab1Frame frame = new Lab1Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab1Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.4);
		splitPane.setBounds(0, 0, 954, 621);
		contentPane.add(splitPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		tfID = new JTextField();
		tfID.setBounds(153, 22, 126, 21);
		panel.add(tfID);
		tfID.setColumns(10);
		
		tfFirstName = new JTextField();
		tfFirstName.setBounds(153, 53, 126, 21);
		panel.add(tfFirstName);
		tfFirstName.setColumns(10);
		
		JLabel lbID = new JLabel("NUID");
		lbID.setBounds(40, 28, 54, 15);
		panel.add(lbID);
		
		JLabel lbFN = new JLabel("First Name");
		lbFN.setBounds(40, 59, 78, 15);
		panel.add(lbFN);
		
		tfLastName = new JTextField();
		tfLastName.setBounds(153, 84, 126, 21);
		panel.add(tfLastName);
		tfLastName.setColumns(10);
		
		tfCollegeName = new JTextField();
		tfCollegeName.setBounds(153, 121, 126, 21);
		panel.add(tfCollegeName);
		tfCollegeName.setColumns(10);
		
		tfphone = new JTextField();
		tfphone.setBounds(153, 152, 126, 21);
		panel.add(tfphone);
		tfphone.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setBounds(153, 183, 126, 21);
		panel.add(tfemail);
		tfemail.setColumns(10);
		
		JLabel lbLN = new JLabel("Last Name");
		lbLN.setBounds(40, 90, 103, 15);
		panel.add(lbLN);
		
		JLabel lbCN = new JLabel("College Name");
		lbCN.setBounds(40, 127, 78, 15);
		panel.add(lbCN);
		
		JLabel lbphone = new JLabel("Official Phone ");
		lbphone.setBounds(40, 158, 103, 15);
		panel.add(lbphone);
		
		JLabel lbemail = new JLabel("Official e-mail");
		lbemail.setBounds(40, 189, 93, 15);
		panel.add(lbemail);
		
		tfStreetName = new JTextField();
		tfStreetName.setBounds(153, 437, 126, 21);
		panel.add(tfStreetName);
		tfStreetName.setColumns(10);
		
		tfAptNo = new JTextField();
		tfAptNo.setBounds(153, 468, 126, 21);
		panel.add(tfAptNo);
		tfAptNo.setColumns(10);
		
		tfCity = new JTextField();
		tfCity.setBounds(153, 499, 126, 21);
		panel.add(tfCity);
		tfCity.setColumns(10);
		
		tfZip = new JTextField();
		tfZip.setBounds(153, 530, 126, 21);
		panel.add(tfZip);
		tfZip.setColumns(10);
		
		JLabel lbSN = new JLabel("Street Name");
		lbSN.setBounds(40, 443, 78, 15);
		panel.add(lbSN);
		
		JLabel lbAN = new JLabel("Apt. No");
		lbAN.setBounds(40, 474, 54, 15);
		panel.add(lbAN);
		
		JLabel lbcity = new JLabel("City/State");
		lbcity.setBounds(40, 505, 78, 15);
		panel.add(lbcity);
		
		JLabel lbzip = new JLabel("ZipCode");
		lbzip.setBounds(40, 536, 54, 15);
		panel.add(lbzip);
		
		JLabel lberror = new JLabel("");
		lberror.setBounds(10, 594, 359, 15);
		panel.add(lberror);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(66, 178, 455, 235);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbCollegeName = new JLabel("College Name");
		lbCollegeName.setBounds(10, 10, 196, 15);
		panel_2.add(lbCollegeName);
		
		JLabel lbName = new JLabel("Name");
		lbName.setFont(new Font("Sitka Heading", Font.PLAIN, 16));
		lbName.setBounds(20, 35, 132, 15);
		panel_2.add(lbName);
		
		JLabel lbNUID = new JLabel("NUID");
		lbNUID.setFont(new Font("Sitka Heading", Font.PLAIN, 16));
		lbNUID.setBounds(243, 35, 143, 15);
		panel_2.add(lbNUID);
		
		JLabel lbPhone = new JLabel("Official Phone Number");
		lbPhone.setBounds(20, 74, 414, 15);
		panel_2.add(lbPhone);
		
		JLabel lbEmail = new JLabel("Official E-mail");
		lbEmail.setBounds(20, 99, 414, 15);
		panel_2.add(lbEmail);
		
		JLabel lbaddress = new JLabel("Permanent Address");
		lbaddress.setBounds(20, 174, 414, 15);
		panel_2.add(lbaddress);
		
		JLabel lbPhone_personal = new JLabel("Personal Phone Number");
		lbPhone_personal.setBounds(20, 124, 414, 15);
		panel_2.add(lbPhone_personal);
		
		JLabel lbEmail_personal = new JLabel("Personal E-mail");
		lbEmail_personal.setBounds(20, 149, 414, 15);
		panel_2.add(lbEmail_personal);
		
		JLabel lbaddress_current = new JLabel("Current Address");
		lbaddress_current.setBounds(20, 199, 414, 15);
		panel_2.add(lbaddress_current);
		
		JButton btnsave = new JButton("Save");
		btnsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Check if there is any empty text field or invalid input
				if(tfID.getText() == null||tfID.getText().length() == 0) {
					lberror.setText("please enter a proper NUID");
					return;
				}else if (tfFirstName.getText() == null || tfFirstName.getText().length() == 0) {
					lberror.setText("The First Name could not be empty");
					return;
				}else if (tfLastName.getText() == null || tfLastName.getText().length() == 0) {
					lberror.setText("The Last Name could not be empty");
					return;
				}else if (tfCollegeName.getText() == null || tfCollegeName.getText().length() == 0) {
					lberror.setText("The College Name could not be empty");
					return;
				}else if (tfphone.getText() == null || tfphone.getText().length() == 0 || tfphone_personal.getText() == null || tfphone_personal.getText().length() == 0) {
					lberror.setText("The Phone number could not be empty");
					return;
				}else if (tfemail.getText() == null || tfemail.getText().length() == 0 || tfemail_personal.getText() == null || tfemail_personal.getText().length() == 0) {
					lberror.setText("The E-mail could not be empty");
					return;
				}else if (tfStreetName.getText() == null || tfStreetName.getText().length() == 0 || tfStreetName_current.getText() == null || tfStreetName_current.getText().length() == 0) {
					lberror.setText("The Street Name could not be empty");
					return;
				}else if (tfAptNo.getText() == null || tfAptNo.getText().length() == 0 || tfAptNo_current.getText() == null || tfAptNo_current.getText().length() == 0) {
					lberror.setText("The Apt. No could not be empty");
					return;
				}else if (tfCity.getText() == null || tfCity.getText().length() == 0 || tfCity_current.getText() == null || tfCity_current.getText().length() == 0) {
					lberror.setText("The City/State could not be empty");
					return;
				}else if (tfZip.getText() == null || tfZip.getText().length() == 0 || tfZip_current.getText() == null || tfZip_current.getText().length() == 0) {
					lberror.setText("The Zip Code could not be empty");
					return;
				}

				// Store the information
				try {
					person.setNUID(Integer.valueOf(tfID.getText()));
				} catch (Exception e2) {
					// TODO: handle exception
					lberror.setText("please enter a proper NUID");
				}
				person.setFirstName(tfFirstName.getText());
				person.setLastName(tfLastName.getText());
				person.setCollegeName(tfCollegeName.getText());
				person.setContactInfo_official(tfphone.getText(), tfemail.getText());
				person.setAddress_permanent(tfStreetName.getText(), tfAptNo.getText(), tfCity.getText(), tfZip.getText());
				person.setContactInfo_personal(tfphone_personal.getText(), tfemail_personal.getText());
				person.setAddress_current(tfStreetName_current.getText(), tfAptNo_current.getText(), tfCity_current.getText(), tfZip_current.getText());
				
				// Display
				lbCollegeName.setText(person.getCollegeName());
				lbNUID.setText(""+person.getNUID());
				// Combine the First Name and Last Name to display Name.
				lbName.setText(person.getFirstName()+" "+person.getLastName());
				Contact contact_official = person.getContactInfo_official();
				Address address_permanent = person.getAddress_permanent();
				Contact contact_personal = person.getContactInfo_personal();
				Address address_current = person.getAddress_current();
				lbPhone.setText(contact_official.getPhone());
				lbEmail.setText(contact_official.getE_mail());
				lbPhone_personal.setText(contact_personal.getPhone());
				lbEmail_personal.setText(contact_personal.getE_mail());
				// Combine St name, Apt No, City/State and Zip Code to display address.
				lbaddress.setText(address_permanent.getStreetName()+" "+address_permanent.getAptNo()+" "+address_permanent.getState()+", "+address_permanent.getZipCode());
				lbaddress_current.setText(address_current.getStreetName()+" "+address_current.getAptNo()+" "+address_current.getState()+", "+address_current.getZipCode());
			}
		});
		btnsave.setBounds(137, 561, 93, 23);
		panel.add(btnsave);
		
		JLabel lblPersonalPhone = new JLabel("Personal Phone ");
		lblPersonalPhone.setBounds(40, 220, 103, 15);
		panel.add(lblPersonalPhone);
		
		tfphone_personal = new JTextField();
		tfphone_personal.setColumns(10);
		tfphone_personal.setBounds(153, 214, 126, 21);
		panel.add(tfphone_personal);
		
		JLabel lbemail_p = new JLabel("Personal e-mail");
		lbemail_p.setBounds(40, 251, 93, 15);
		panel.add(lbemail_p);
		
		tfemail_personal = new JTextField();
		tfemail_personal.setColumns(10);
		tfemail_personal.setBounds(153, 245, 126, 21);
		panel.add(tfemail_personal);
		
		JLabel lbSN_current = new JLabel("Street Name");
		lbSN_current.setBounds(40, 303, 78, 15);
		panel.add(lbSN_current);
		
		tfStreetName_current = new JTextField();
		tfStreetName_current.setColumns(10);
		tfStreetName_current.setBounds(153, 297, 126, 21);
		panel.add(tfStreetName_current);
		
		JLabel lbAN_current = new JLabel("Apt. No");
		lbAN_current.setBounds(40, 334, 54, 15);
		panel.add(lbAN_current);
		
		tfAptNo_current = new JTextField();
		tfAptNo_current.setColumns(10);
		tfAptNo_current.setBounds(153, 328, 126, 21);
		panel.add(tfAptNo_current);
		
		JLabel lbcity_current = new JLabel("City/State");
		lbcity_current.setBounds(40, 365, 78, 15);
		panel.add(lbcity_current);
		
		tfCity_current = new JTextField();
		tfCity_current.setColumns(10);
		tfCity_current.setBounds(153, 359, 126, 21);
		panel.add(tfCity_current);
		
		JLabel lbzip_current = new JLabel("ZipCode");
		lbzip_current.setBounds(40, 396, 54, 15);
		panel.add(lbzip_current);
		
		tfZip_current = new JTextField();
		tfZip_current.setColumns(10);
		tfZip_current.setBounds(153, 390, 126, 21);
		panel.add(tfZip_current);
		
		JLabel lblNewLabel = new JLabel("Current Address");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 278, 144, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Permanent Address");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 418, 133, 15);
		panel.add(lblNewLabel_1);
	}
}
