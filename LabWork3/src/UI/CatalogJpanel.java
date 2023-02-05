package UI;

import javax.swing.JPanel;

import Model.Application;
import Model.MedcineCatalog;
import Model.Medicne;
import Model.Observation;
import Model.VitaSignHistory;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.DisplayMode;
import java.awt.event.ActionEvent;

public class CatalogJpanel extends JPanel {
	private Application application;
	private JTextField tfName;
	private JTextField tfDosage;
	private JTable table;
	private DefaultTableModel tableModel;
	
	/**
	 * Create the panel.
	 */
	public CatalogJpanel(Application application) {
		this.application = application;
		MedcineCatalog catalog = application.getCatalog();
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add and Delete Medcine");
		lblNewLabel.setBounds(230, 40, 164, 15);
		add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(50, 159, 76, 15);
		add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(124, 153, 128, 21);
		add(tfName);
		
		JLabel lblDosage = new JLabel("Dosage");
		lblDosage.setBounds(50, 236, 102, 15);
		add(lblDosage);
		
		tfDosage = new JTextField();
		tfDosage.setColumns(10);
		tfDosage.setBounds(124, 230, 128, 21);
		add(tfDosage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(304, 89, 322, 331);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Dosage"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		tableModel = (DefaultTableModel) table.getModel();
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!catalog.checkMedcineUnique(tfName.getText())) {
					JOptionPane.showMessageDialog(null, "The name should be unique!");
					return;
				}
				
				catalog.createMedicne(tfName.getText(), Double.parseDouble(tfDosage.getText()));
				display();
			}
		});
		btnAdd.setBounds(101, 344, 93, 23);
		add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (catalog.getMedicneCatalog().size() <= 0 || table.getSelectedRow() < 0) {
					return;
				}
				catalog.delete(table.getSelectedRow());
				display();
			}
		});
		btnDelete.setBounds(394, 442, 137, 23);
		add(btnDelete);
		
		display();
	}
	
	public void display() {
		MedcineCatalog catalog = this.application.getCatalog();
		
		tableModel.setRowCount(0);
		if(catalog.getMedicneCatalog().size() > 0) {
			for (Medicne o:catalog.getMedicneCatalog()) {
				
				Object row[] = new Object[2];
				row[0] = o.getMedcineName();
				row[1] = o.getDosage();
				
				tableModel.addRow(row);
			}
		}else {
			System.out.println("Empty list");
		}
	}

}
