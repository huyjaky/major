package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

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
	
	/**
	 * 
	 */
	public counterview() {
		setTitle("TUONG TAC FILE");
		Font font = new Font ("JetBrains Mono", Font.BOLD, 23);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600, 600);
		
		URL url = counterview.class.getResource("programming.png");
		Image img_icon = Toolkit.getDefaultToolkit().createImage(url);
		this.setIconImage(img_icon);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		JMenuItem menu_history = new JMenuItem("reset history");
		mnNewMenu.add(menu_history);
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
	
		JRadioButton history = new JRadioButton("lich su");
		//JButton button_action = new JButton("thuc thi");
		
		ButtonGroup group = new ButtonGroup(); group.add(checkexcute_1); group.add(can_read); group.add(can_write); group.add(print_url); group.add(print_namefile); group.add(check_folder_file); group.add(print_tree_folder); group.add(move_file); group.add(copy_file); group.add(write_file_txt); group.add(history);
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
		panel_luachon.add(history);
		
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

		this.addWindowListener(new WindowListener() {

			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
				modul.history();			
			}

			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
//---------------------------------------------------------------------------------------------------------
		// create action buttons
		checkexcute_1.addActionListener(new ActionListener() {

			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				modul.history += textField.getText() + "\n";
				modul.history();

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
				modul.history += textField.getText() + "\n";
				modul.history();
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
				modul.history += textField.getText() + "\n";
				modul.history();
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
				modul.history += textField.getText() + "\n";
				modul.history();
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
				modul.history += textField.getText() + "\n";
				modul.history();
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
				modul.history += textField.getText() + "\n";
				modul.history();
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
					modul.history +=textField.getText() + "\n";
					if (folder.isFile()) {
						JOptionPane.showConfirmDialog(null, "DAY LA MOT FILE KHONG PHAI MOT FOLDER", "ERROR", JOptionPane.YES_OPTION);
						return;
					}
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
				new view_copy();
				
			}
		});

		history.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file_save = new File(System.getProperty("user.dir") + "/save.data");
					List<String> list_history = Files.readAllLines(file_save.toPath(), StandardCharsets.UTF_8);
					view_history view_history = new view_history();
					String label = "";
					for (String i : list_history) {
						label += i + "\n";
					}
					view_history.label_history.setText(label);
					view_history.setVisible(true);
				} catch (Exception e) {
					// TODO: handle exception
				}
			} 
		});

		menu_history.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				modul.reset_history();
				JOptionPane.showMessageDialog(null, "DA XOA THANH CONG", "MESSAGE", JOptionPane.CLOSED_OPTION);
			}
		});
		setVisible(true);
	}
}
