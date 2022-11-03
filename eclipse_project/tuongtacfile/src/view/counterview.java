package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modul.countermodul;

public class counterview extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public JLabel ketqua;
	public countermodul modul = new countermodul();
	
	public counterview() {
		setTitle("TUONG TAC FILE");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600, 600);
		
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
		panel_tong.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_luachon = new JPanel();
		panel_tong.add(panel_luachon);
		
		JRadioButton checkexcute_1 = new JRadioButton("kiem tra file co the thuc thi");
		
		JRadioButton can_read = new JRadioButton("kiem tra file co the doc");
		
		JRadioButton can_write = new JRadioButton("kiem tra file co the ghi");
		
		JRadioButton print_url = new JRadioButton("in duong dan");
		
		JRadioButton print_namefile = new JRadioButton("in ten files");
		
		JRadioButton check_folder_file = new JRadioButton("kiem tra file la thu muc hoac tap tin");
		
		JRadioButton print_tree_folder = new JRadioButton("in ra cay thu muc");
		
		JRadioButton move_file = new JRadioButton("di chuyen file ");
		
		JRadioButton copy_file = new JRadioButton("copy file toi dia chi");
		
		JRadioButton write_file_txt = new JRadioButton("tao file va ghi len file do (txt)");
	
		//JButton button_action = new JButton("thuc thi");
		
		ButtonGroup group = new ButtonGroup(); group.add(checkexcute_1); group.add(can_read); group.add(can_write); group.add(print_url); group.add(print_namefile); group.add(check_folder_file); group.add(print_tree_folder);
		panel_luachon.setLayout(new GridLayout(0, 3, 0, 0));
		panel_luachon.add(checkexcute_1);
		panel_luachon.add(can_read);
		panel_luachon.add(can_write);
		panel_luachon.add(print_url);
		panel_luachon.add(print_namefile);
		panel_luachon.add(check_folder_file);
		panel_luachon.add(print_tree_folder);
		panel_luachon.add(copy_file);
		panel_luachon.add(move_file);
		panel_luachon.add(write_file_txt);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		panel_luachon.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		panel_luachon.add(rdbtnNewRadioButton_2);

		JPanel top = new JPanel();
		contentPane.add(top, BorderLayout.NORTH);
		top.setLayout(new GridLayout(2, 1, 0, 0));
		
		textField = new JTextField();
		textField.setColumns(10);
		top.add(textField);
		
		this.ketqua = new JLabel("Ket Qua");
		top.add(ketqua);
//---------------------------------------------------------------------------------------------------------
		// create action buttons
		checkexcute_1.addActionListener(new ActionListener() {

			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AbstractButton button = (AbstractButton) arg0.getSource();
				boolean f = button.getModel().isSelected();
				if (f) {
					if (modul.check_file_excute(textField.getText())) {
						ketqua.setText("co the thuc thi");
					} else {
						ketqua.setText("khong the thuc thi");
					}
				}
			}
		});

		can_read.addActionListener(new ActionListener() {

            /* (non-Javadoc)
             * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
             */
			public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                AbstractButton button = (AbstractButton) arg0.getSource();
                boolean f = button.getModel().isSelected();
                if (f) {
					System.out.println("checkout");
					if (modul.check_file_canread(textField.getText().toString())) {
						ketqua.setText("file co the doc");
					} else {
						ketqua.setText("file khong the doc");
					}
				}
			}
		});

		can_write.addActionListener(new ActionListener() {

            /* (non-Javadoc)
             * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
             */
			public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                AbstractButton button = (AbstractButton) arg0.getSource();
                boolean f = button.getModel().isSelected();
                if (f) {
					if (modul.check_file_canwrite(textField.getText())) {
						ketqua.setText("file co the ghi");
					} else {
						ketqua.setText("file khong the ghi");
					}
				}
			}
		});
		
		print_url.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AbstractButton button = (AbstractButton) arg0.getSource();
				boolean f = button.getModel().isSelected();

				if (modul.check_file_excute(textField.getText())) {
					File folder = new File(textField.getText());
					ketqua.setText(folder.getAbsolutePath());
				} else {
					ketqua.setText("file nay khong the thuc thi");
				}
			}
		});

		print_namefile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AbstractButton button = (AbstractButton) arg0.getSource();
				boolean f = button.getModel().isSelected();
                if (f) {
					if (modul.check_file_excute(textField.getText())) {
						ketqua.setText(modul.print_name_file(textField.getText()));
					} else {
						ketqua.setText("khong the xuat ten");
					}
				}
			}
		});

		check_folder_file.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AbstractButton button = (AbstractButton) arg0.getSource();
				boolean f = button.getModel().isSelected();

				if (f) {
					if (modul.check_file_excute(textField.getText())) {
						if (modul.check_file_or_folder(textField.getText())) {
							ketqua.setText("day la mot folder");
						} else {
							ketqua.setText("day la mot file");
						}
					}
				}
			}
		});

		print_tree_folder.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				AbstractButton button = (AbstractButton) arg0.getSource();
				boolean f = button.getModel().isSelected();

				if (modul.check_file_excute(textField.getText())) {
					File folder = new File(textField.getText());
					modul.print_tree_folder(folder, "");
					view_tree view = new view_tree();
					view.textArea.setText(modul.tree_folder);
				}
			}
		});

		write_file_txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new create_file();
			}
		});

		//tu phan nay la phan bi loi ko biet cach fix nen de lai nha
		copy_file.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				view_copy copy = new view_copy();
				
			}
		});
		setVisible(true);
	}
}
