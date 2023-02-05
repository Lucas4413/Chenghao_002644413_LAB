package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Application;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private Application application;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		this.application = new Application();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.25);
		splitPane.setBounds(0, 0, 877, 530);
		contentPane.add(splitPane);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		JButton btnCreateObservation = new JButton("Create Observation");
		btnCreateObservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				splitPane.setRightComponent(new CreateJpanel(application));
			}
		});
		btnCreateObservation.setBounds(10, 60, 195, 23);
		panel.add(btnCreateObservation);
		
		JButton btnViewVitalSignHistory = new JButton("View Vital Sign History");
		btnViewVitalSignHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				splitPane.setRightComponent(new ViewJpanel(application));
			}
		});
		btnViewVitalSignHistory.setBounds(10, 125, 195, 23);
		panel.add(btnViewVitalSignHistory);
		
		JButton btnMedcineCatalog = new JButton("Medcine Catalog");
		btnMedcineCatalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				splitPane.setRightComponent(new CatalogJpanel(application));
			}
		});
		btnMedcineCatalog.setBounds(10, 184, 195, 23);
		panel.add(btnMedcineCatalog);
		
		JButton btnAssignMedcine = new JButton("Assign Medcine");
		btnAssignMedcine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				splitPane.setRightComponent(new MedcineAssignJpanel(application));
			}
		});
		btnAssignMedcine.setBounds(10, 254, 195, 23);
		panel.add(btnAssignMedcine);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
	}
}
