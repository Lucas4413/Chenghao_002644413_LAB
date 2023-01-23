package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Module.Address;
import Module.Contact;
import Module.Person;

import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

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
		setBounds(100, 100, 626, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.4);
		splitPane.setBounds(0, 0, 610, 431);
		contentPane.add(splitPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		tfID = new JTextField();
		tfID.setBounds(90, 25, 126, 21);
		panel.add(tfID);
		tfID.setColumns(10);
		
		tfFirstName = new JTextField();
		tfFirstName.setBounds(90, 56, 126, 21);
		panel.add(tfFirstName);
		tfFirstName.setColumns(10);
		
		JLabel lbID = new JLabel("NUID");
		lbID.setBounds(10, 28, 54, 15);
		panel.add(lbID);
		
		JLabel lbFN = new JLabel("First Name");
		lbFN.setBounds(10, 59, 78, 15);
		panel.add(lbFN);
		
		tfLastName = new JTextField();
		tfLastName.setBounds(90, 87, 126, 21);
		panel.add(tfLastName);
		tfLastName.setColumns(10);
		
		tfCollegeName = new JTextField();
		tfCollegeName.setBounds(90, 124, 126, 21);
		panel.add(tfCollegeName);
		tfCollegeName.setColumns(10);
		
		tfphone = new JTextField();
		tfphone.setBounds(90, 155, 126, 21);
		panel.add(tfphone);
		tfphone.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setBounds(90, 186, 126, 21);
		panel.add(tfemail);
		tfemail.setColumns(10);
		
		JLabel lbLN = new JLabel("Last Name");
		lbLN.setBounds(10, 90, 54, 15);
		panel.add(lbLN);
		
		JLabel lbCN = new JLabel("College Name");
		lbCN.setBounds(10, 127, 78, 15);
		panel.add(lbCN);
		
		JLabel lbphone = new JLabel("Phone ");
		lbphone.setBounds(10, 158, 54, 15);
		panel.add(lbphone);
		
		JLabel lbemail = new JLabel("e-mail");
		lbemail.setBounds(10, 189, 54, 15);
		panel.add(lbemail);
		
		tfStreetName = new JTextField();
		tfStreetName.setBounds(90, 217, 126, 21);
		panel.add(tfStreetName);
		tfStreetName.setColumns(10);
		
		tfAptNo = new JTextField();
		tfAptNo.setBounds(90, 248, 126, 21);
		panel.add(tfAptNo);
		tfAptNo.setColumns(10);
		
		tfCity = new JTextField();
		tfCity.setBounds(90, 279, 126, 21);
		panel.add(tfCity);
		tfCity.setColumns(10);
		
		tfZip = new JTextField();
		tfZip.setBounds(90, 310, 126, 21);
		panel.add(tfZip);
		tfZip.setColumns(10);
		
		JLabel lbSN = new JLabel("Street Name");
		lbSN.setBounds(10, 220, 78, 15);
		panel.add(lbSN);
		
		JLabel lbAN = new JLabel("Apt. No");
		lbAN.setBounds(10, 251, 54, 15);
		panel.add(lbAN);
		
		JLabel lbcity = new JLabel("City/State");
		lbcity.setBounds(10, 282, 78, 15);
		panel.add(lbcity);
		
		JLabel lbzip = new JLabel("ZipCode");
		lbzip.setBounds(10, 313, 54, 15);
		panel.add(lbzip);
		
		JLabel lberror = new JLabel("");
		lberror.setBounds(10, 390, 270, 15);
		panel.add(lberror);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 75, 342, 191);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbCollegeName = new JLabel("College Name");
		lbCollegeName.setBounds(10, 10, 196, 15);
		panel_2.add(lbCollegeName);
		
		JLabel lbName = new JLabel("Name");
		lbName.setBounds(20, 35, 132, 15);
		panel_2.add(lbName);
		
		JLabel lbNUID = new JLabel("NUID");
		lbNUID.setBounds(173, 35, 143, 15);
		panel_2.add(lbNUID);
		
		JLabel lbPhone = new JLabel("Phone Number");
		lbPhone.setBounds(20, 74, 312, 15);
		panel_2.add(lbPhone);
		
		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setBounds(20, 109, 312, 15);
		panel_2.add(lbEmail);
		
		JLabel lbaddress = new JLabel("Address");
		lbaddress.setBounds(20, 148, 312, 15);
		panel_2.add(lbaddress);
		
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
				}else if (tfphone.getText() == null || tfphone.getText().length() == 0) {
					lberror.setText("The Phone number could not be empty");
					return;
				}else if (tfemail.getText() == null || tfemail.getText().length() == 0) {
					lberror.setText("The E-mail could not be empty");
					return;
				}else if (tfStreetName.getText() == null || tfStreetName.getText().length() == 0) {
					lberror.setText("The Street Name could not be empty");
					return;
				}else if (tfAptNo.getText() == null || tfAptNo.getText().length() == 0) {
					lberror.setText("The Apt. No could not be empty");
					return;
				}else if (tfCity.getText() == null || tfCity.getText().length() == 0) {
					lberror.setText("The City/State could not be empty");
					return;
				}else if (tfZip.getText() == null || tfZip.getText().length() == 0) {
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
				person.setContactInfo(tfphone.getText(), tfemail.getText());
				person.setAddress(tfStreetName.getText(), tfAptNo.getText(), tfCity.getText(), tfZip.getText());
				
				// Display
				lbCollegeName.setText(person.getCollegeName());
				lbNUID.setText(""+person.getNUID());
				// Combine the First Name and Last Name to display Name.
				lbName.setText(person.getFirstName()+" "+person.getLastName());
				Contact contact = person.getContactInfo();
				Address address = person.getAddress();
				lbPhone.setText(contact.getPhone());
				lbEmail.setText(contact.getE_mail());
				// Combine St name, Apt No, City/State and Zip Code to display address.
				lbaddress.setText(address.getStreetName()+" "+address.getAptNo()+" "+address.getState()+", "+address.getZipCode());
				
			}
		});
		btnsave.setBounds(63, 357, 93, 23);
		panel.add(btnsave);
	}
}
