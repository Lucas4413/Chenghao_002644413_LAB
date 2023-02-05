package UI;

import java.net.SocketTimeoutException;
import java.nio.channels.NonReadableChannelException;

import javax.swing.JPanel;

import Model.Application;
import Model.MedcineCatalog;
import Model.Observation;
import Model.VitaSignHistory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewJpanel extends JPanel {
	private Application application;
	private JTextField tfID;
	private JTextField tfTemp;
	private JTextField tfBloodPressure;
	private JTable table;
	DefaultTableModel tableModel;
	/**
	 * Create the panel.
	 */
	public ViewJpanel(Application application) {
		this.application = application;
		VitaSignHistory history = application.getHistory();
		MedcineCatalog catalog = application.getCatalog();
		
		setLayout(null);
		
		JLabel lblViewTheCatalog = new JLabel("View and update the Catalog");
		lblViewTheCatalog.setBounds(253, 41, 200, 15);
		add(lblViewTheCatalog);
		
		JLabel lbId = new JLabel("ID");
		lbId.setBounds(49, 102, 76, 15);
		add(lbId);
		
		tfID = new JTextField();
		tfID.setEnabled(false);
		tfID.setColumns(10);
		tfID.setBounds(185, 96, 66, 21);
		add(tfID);
		
		JLabel lbTemp = new JLabel("Temperature");
		lbTemp.setBounds(49, 172, 76, 15);
		add(lbTemp);
		
		tfTemp = new JTextField();
		tfTemp.setColumns(10);
		tfTemp.setBounds(185, 166, 66, 21);
		add(tfTemp);
		
		JLabel lbBloodPressure = new JLabel("Blood Pressure");
		lbBloodPressure.setBounds(49, 249, 102, 15);
		add(lbBloodPressure);
		
		tfBloodPressure = new JTextField();
		tfBloodPressure.setColumns(10);
		tfBloodPressure.setBounds(185, 243, 66, 21);
		add(tfBloodPressure);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idToUpdate = Integer.valueOf(tfID.getText());
				for (Observation o:history.getVitaSignHistory()) {
					if(o.getObservationId() == idToUpdate) {
						o.setBloodPress(Double.parseDouble(tfBloodPressure.getText()));
						o.setTemperature(Double.parseDouble(tfTemp.getText()));
						display();
					}
				}
			}
		});
		btnUpdate.setBounds(100, 357, 93, 23);
		add(btnUpdate);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(303, 102, 322, 331);
		add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Blood Pressure", "Temperature"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(116);
		table.getColumnModel().getColumn(2).setPreferredWidth(103);
		scrollPane.setViewportView(table);
		
		tableModel =(DefaultTableModel) table.getModel();
		
		JButton btnDetail = new JButton("View Detail");
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				
				if (selectedRow>=0) {
					Observation selectedObservation = ViewJpanel.this.application.getHistory().getVitaSignHistory().get(selectedRow);
				
					tfID.setText(""+selectedObservation.getObservationId());
					tfTemp.setText(""+selectedObservation.getTemperature());
					tfBloodPressure.setText(""+selectedObservation.getBloodPress());
				}
				
			}
		});
		btnDetail.setBounds(393, 455, 137, 23);
		add(btnDetail);
		
		display();
	}

	public void display() {
		VitaSignHistory history = this.application.getHistory();
		
		tableModel.setRowCount(0);
		if(history.getVitaSignHistory().size() > 0) {
			for (Observation o:history.getVitaSignHistory()) {
				System.out.println(o.getObservationId());
				
				Object row[] = new Object[3];
				row[0] = o.getObservationId();
				row[1] = o.getBloodPress();
				row[2] = o.getTemperature();
				
				tableModel.addRow(row);
			}
		}else {
			System.out.println("Empty list");
		}
	}
}
