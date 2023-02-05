package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.Application;
import Model.VitaSignHistory;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CreateJpanel extends JPanel {
	private JTextField tfID;
	private JTextField tfTemp;
	private JTextField tfBloodPressure;
	private Application application;
	/**
	 * Create the panel.
	 */
	public CreateJpanel(Application application) {
		this.application = application;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create a Vital Sign");
		lblNewLabel.setBounds(242, 31, 200, 15);
		add(lblNewLabel);
		
		JLabel lbId = new JLabel("ID");
		lbId.setBounds(177, 92, 76, 15);
		add(lbId);
		
		tfID = new JTextField();
		tfID.setBounds(313, 86, 150, 21);
		add(tfID);
		tfID.setColumns(10);
		
		JLabel lbTemp = new JLabel("Temperature");
		lbTemp.setBounds(177, 162, 76, 15);
		add(lbTemp);
		
		tfTemp = new JTextField();
		tfTemp.setColumns(10);
		tfTemp.setBounds(313, 156, 150, 21);
		add(tfTemp);
		
		JLabel lbBloodPressure = new JLabel("Blood Pressure");
		lbBloodPressure.setBounds(177, 239, 102, 15);
		add(lbBloodPressure);
		
		tfBloodPressure = new JTextField();
		tfBloodPressure.setColumns(10);
		tfBloodPressure.setBounds(313, 233, 150, 21);
		add(tfBloodPressure);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VitaSignHistory vitaSignHistory = application.getHistory();
				if(!vitaSignHistory.checkObservationIdUnique(Integer.valueOf(tfID.getText()))) {
					JOptionPane.showMessageDialog(null, "The ID should be unique");
					return;
				}
				vitaSignHistory.createObservation(Integer.valueOf(tfID.getText()), Double.parseDouble(tfBloodPressure.getText()), Double.parseDouble(tfTemp.getText()));
				
				application.setHistory(vitaSignHistory);
				JOptionPane.showMessageDialog(null, "Added a Vita Sign!");
			}
		});
		btnAdd.setBounds(263, 347, 93, 23);
		add(btnAdd);

	}
}
