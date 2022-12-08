package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class counterview extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					counterview frame = new counterview();
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
	public counterview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_top = new JPanel();
		panel_top.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_top);
		panel_top.setLayout(new GridLayout(0, 6, 10, 12));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_top.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		panel_top.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_top.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_top.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		panel_top.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_top.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		table = new JTable(6, 8);
		panel_2.add(table);
		table.add
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
	}

}
