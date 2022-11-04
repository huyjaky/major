package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modul.countermodul;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class create_file extends JFrame {

	private JPanel contentPane;
	private JTextField url_file;
	protected JTextArea textArea;
	private JButton btnWrite;
	private countermodul modul;

	public create_file() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_top = new JPanel();
		contentPane.add(panel_top, BorderLayout.NORTH);
		panel_top.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel label_text = new JLabel("URL FILE/FOLDER", JLabel.CENTER);
		
		panel_top.add(label_text);
		
		url_file = new JTextField();
		panel_top.add(url_file);
		url_file.setColumns(10);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		btnWrite = new JButton("Write");
		contentPane.add(btnWrite, BorderLayout.SOUTH);

		setVisible(true);

		btnWrite.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
					try {
						PrintWriter pw = new PrintWriter(url_file.getText(), "UTF-8");
						pw.print(textArea.getText());
						pw.flush();
						pw.close();
						JOptionPane.showConfirmDialog(null, "GHI DE THANH CONG", "MESSAGE", JOptionPane.CLOSED_OPTION);
						setVisible(false);
					} catch (Exception e) {
						// TODO: handle exception
						e.getStackTrace();
					}
			}
		});
	}
	

}
