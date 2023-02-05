package UI;

import javax.swing.JPanel;

import Model.Application;
import Model.MedcineCatalog;
import Model.Medicne;
import Model.Observation;
import Model.VitaSignHistory;

import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedcineAssignJpanel extends JPanel {

	
	private Application application;
	/**
	 * Create the panel.
	 */
	public MedcineAssignJpanel(Application application) {
		this.application = application;
		MedcineCatalog catalog = this.application.getCatalog();
		VitaSignHistory history = this.application.getHistory();
		
		setLayout(null);
		
		Choice choiceVitaSign = new Choice();
		choiceVitaSign.setBounds(132, 185, 152, 21);
		add(choiceVitaSign);
		
		JLabel lblNewLabel = new JLabel("Assign a Medcine");
		lblNewLabel.setBounds(268, 99, 123, 15);
		add(lblNewLabel);
		
		Choice choiceMedcine = new Choice();
		choiceMedcine.setBounds(461, 185, 152, 21);
		add(choiceMedcine);
		
		JLabel lbInfo = new JLabel("");
		lbInfo.setBounds(156, 369, 333, 15);
		add(lbInfo);
		
		JLabel lbVS = new JLabel("Vital Sign:");
		lbVS.setBounds(46, 191, 80, 15);
		add(lbVS);
		
		JLabel lblMedcine = new JLabel("Medcine:");
		lblMedcine.setBounds(389, 191, 66, 15);
		add(lblMedcine);
		
		JButton btnAssign = new JButton("Assign");
		btnAssign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String medSelected = choiceMedcine.getSelectedItem();
				String vsIdSelected = choiceVitaSign.getSelectedItem();
				
				int selectedVitaSignIndex = history.getIndexWithID(Integer.valueOf(vsIdSelected));
				
				history.getValueAt(selectedVitaSignIndex).setMedcine(catalog.getMedcineWithName(medSelected));
				
				int assignedVSId = history.getVitaSignHistory().get(selectedVitaSignIndex).getObservationId(); 
				String medcineAssigned = catalog.getMedcineWithName(medSelected).getMedcineName();
				lbInfo.setText("Medcine "+medcineAssigned+" is now assigned to Vital Sign "+assignedVSId);
			}
		});
		btnAssign.setBounds(280, 269, 93, 23);
		add(btnAssign);
		
		for (Observation o : history.getVitaSignHistory()) {
			choiceVitaSign.add(""+o.getObservationId());
		}
		for (Medicne medicne : catalog.getMedicneCatalog()) {
			choiceMedcine.add(medicne.getMedcineName());
		}
		
	}
}
