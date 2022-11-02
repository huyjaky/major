package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Label;

public class counterview extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public JLabel ketqua;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public counterview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 600);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("reset");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_tong = new JPanel();
		contentPane.add(panel_tong, BorderLayout.CENTER);
		panel_tong.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_luachon = new JPanel();
		panel_tong.add(panel_luachon, BorderLayout.CENTER);
		panel_luachon.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("kiem tra file co the thuc thi");
		rdbtnNewRadioButton_1.setBounds(0, 1, 141, 61);
		panel_luachon.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("kiem tra file co the doc");
		rdbtnNewRadioButton.setBounds(141, 1, 141, 61);
		panel_luachon.add(rdbtnNewRadioButton);
		
		JRadioButton chckbxNewCheckBox = new JRadioButton("kiem tra file co the ghi");
		chckbxNewCheckBox.setBounds(282, 1, 141, 61);
		panel_luachon.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("in duong dan");
		rdbtnNewRadioButton_2.setBounds(0, 62, 141, 61);
		panel_luachon.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("in ten files");
		rdbtnNewRadioButton_3.setBounds(141, 62, 141, 61);
		panel_luachon.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("kiem tra file la thu muc hoac tap tin");
		rdbtnNewRadioButton_4.setBounds(282, 62, 141, 61);
		panel_luachon.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("in ra cay thu muc");
		rdbtnNewRadioButton_5.setBounds(0, 123, 141, 61);
		panel_luachon.add(rdbtnNewRadioButton_5);
		
		JButton btnNewButton = new JButton("thuc thi");
		btnNewButton.setBounds(141, 123, 273, 61);
		panel_luachon.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(282, 123, 141, 61);
		panel_luachon.add(label);
		
		JPanel top = new JPanel();
		contentPane.add(top, BorderLayout.NORTH);
		top.setLayout(new GridLayout(2, 1, 0, 0));
		
		textField = new JTextField("text");
		textField.setColumns(10);
		top.add(textField);
		
		this.ketqua = new JLabel("Ket Qua");
		top.add(ketqua);

		setVisible(true);

	}
}
