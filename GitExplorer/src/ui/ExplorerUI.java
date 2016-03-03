package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTree;

public class ExplorerUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExplorerUI window = new ExplorerUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExplorerUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 827, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTreeUrl = new JLabel("Tree URL");
		lblTreeUrl.setBounds(10, 11, 52, 14);
		frame.getContentPane().add(lblTreeUrl);
		
		textField = new JTextField();
		textField.setBounds(72, 8, 630, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGo = new JButton("Go");
		btnGo.setBounds(712, 7, 89, 23);
		frame.getContentPane().add(btnGo);
		
		JTree tree = new JTree();
		tree.setBounds(10, 36, 291, 544);
		frame.getContentPane().add(tree);
	}
}
