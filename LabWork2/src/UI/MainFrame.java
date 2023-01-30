package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Package;

import javax.swing.JSplitPane;
import javax.print.attribute.standard.PagesPerMinute;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private Package package1 = new Package();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.3);
		splitPane.setBounds(0, 0, 612, 398);
		contentPane.add(splitPane);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Create create = new Create(package1);
				splitPane.setRightComponent(create);
			}
		});
		btnCreate.setBounds(40, 43, 93, 23);
		panel.add(btnCreate);
		
		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Read read = new Read(package1);
				splitPane.setRightComponent(read);
			}
		});
		btnRead.setBounds(40, 101, 93, 23);
		panel.add(btnRead);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update update = new Update(package1);
				splitPane.setRightComponent(update);
			}
		});
		btnUpdate.setBounds(40, 166, 93, 23);
		panel.add(btnUpdate);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
	}
}
