package view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class view_copy extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public view_copy() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1));
		
		JLabel text_copy1 = new JLabel("URL file copy", JLabel.CENTER);
		contentPane.add(text_copy1);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel text_copy2 = new JLabel("URL folder locate copy", JLabel.CENTER);
		contentPane.add(text_copy2);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		this.dispose();
	}

}
