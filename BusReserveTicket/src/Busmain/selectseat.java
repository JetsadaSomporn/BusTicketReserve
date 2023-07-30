package Busmain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.JPanel;
import java.awt.Toolkit;

public class selectseat {
	private static JFrame selectseatframe;
	public static String seatselected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectseat window = new selectseat();
					window.selectseatframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public selectseat() {
		initializeseat();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initializeseat() {
		selectseatframe = new JFrame();
		selectseatframe.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\66839\\Downloads\\49638C29-6A8D-423C-B261-EC56B0550AF8.png"));
		selectseatframe.setSize(900, 600);
		selectseatframe.setFont(new Font("Dialog", Font.BOLD, 15));
		selectseatframe.setTitle("ReserveYourTicket");

		selectseatframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton A1 = new JButton("A1");
		A1.setBounds(240, 60, 77, 45);
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A1.getText();
				seatConfirm();

			}
		});
		selectseatframe.getContentPane().setLayout(null);
		selectseatframe.getContentPane().add(A1);

		JButton A2 = new JButton("A2");
		A2.setBounds(240, 116, 77, 45);
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A2.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(A2);

		JButton A3 = new JButton("A3");
		A3.setBounds(240, 172, 77, 45);
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A3.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(A3);

		JButton A4 = new JButton("A4");
		A4.setBounds(240, 228, 77, 45);
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A4.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(A4);

		JButton A5 = new JButton("A5");
		A5.setBounds(240, 284, 77, 45);
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A5.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(A5);

		JButton A6 = new JButton("A6");
		A6.setBounds(240, 340, 77, 45);
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A6.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(A6);

		JButton A7 = new JButton("A7");
		A7.setBounds(240, 396, 77, 45);
		A7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A7.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(A7);

		JButton A8 = new JButton("A8");
		A8.setBounds(240, 452, 77, 45);
		A8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = A8.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(A8);

		JButton B1 = new JButton("B1");
		B1.setBounds(459, 60, 77, 45);
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B1.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B1);

		JButton B2 = new JButton("B2");
		B2.setBounds(459, 116, 77, 45);
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B2.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B2);

		JButton B3 = new JButton("B3");
		B3.setBounds(459, 172, 77, 45);
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B3.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B3);

		JButton B4 = new JButton("B4");
		B4.setBounds(459, 228, 77, 45);
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B4.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B4);

		JButton B5 = new JButton("B5");
		B5.setBounds(459, 284, 77, 45);
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B5.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B5);

		JButton B6 = new JButton("B6");
		B6.setBounds(459, 340, 77, 45);
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B6.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B6);

		JButton B7 = new JButton("B7");
		B7.setBounds(459, 396, 77, 45);
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B7.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B7);

		JButton B8 = new JButton("B8");
		B8.setBounds(459, 452, 77, 45);
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = B8.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(B8);

		JButton C1 = new JButton("C1");
		C1.setBounds(563, 60, 77, 45);
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C1.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C1);

		JButton C2 = new JButton("C2");
		C2.setBounds(563, 116, 77, 45);
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C2.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C2);

		JButton C3 = new JButton("C3");
		C3.setBounds(563, 172, 77, 45);
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C3.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C3);

		JButton C4 = new JButton("C4");
		C4.setBounds(563, 228, 77, 45);
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C4.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C4);

		JButton C5 = new JButton("C5");
		C5.setBounds(563, 284, 77, 45);
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C5.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C5);

		JButton C6 = new JButton("C6");
		C6.setBounds(563, 340, 77, 45);
		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C6.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C6);

		JButton C7 = new JButton("C7");
		C7.setBounds(563, 396, 77, 45);
		C7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C7.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C7);

		JButton C8 = new JButton("C8");
		C8.setBounds(563, 452, 77, 45);
		C8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatselected = C8.getText();
				seatConfirm();
			}
		});
		selectseatframe.getContentPane().add(C8);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(573, 10, 99, 53);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\66839\\Downloads\\pngegg (1).png"));
		ImageIcon icon = new ImageIcon("C:\\Users\\66839\\Downloads\\pngegg (1).png");
		lblNewLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(55, 30, Image.SCALE_SMOOTH)));
		selectseatframe.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ที่นั่งว่าง");
		lblNewLabel_1.setFont(new Font("TH SarabunPSK", Font.BOLD, 15));
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(802, 292, 38, 28);
		selectseatframe.getContentPane().add(lblNewLabel_1);

		JButton C8_1 = new JButton("");
		C8_1.setBounds(737, 284, 55, 45);
		selectseatframe.getContentPane().add(C8_1);

		JButton btnNewButton = new JButton("ย้อนกลับ");
		btnNewButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Infoinput info = new Infoinput();
				selectseatframe.dispose();
			}
		});
		btnNewButton.setBounds(22, 10, 86, 45);
		selectseatframe.getContentPane().add(btnNewButton);

		try {
			Scanner scan = new Scanner(new File(Selectway.firstPoint + Selectway.lastPoint + Selectway.day
					+ Selectway.month + Selectway.year + Infoinput.ticketType + ".txt"));
			while (scan.hasNext()) {
				String line = scan.nextLine();
				if (line.equals(A1.getText())) {
					A1.setBackground(Color.RED);
					A1.setEnabled(false);
				} else if (line.equals(A2.getText())) {
					A2.setBackground(Color.RED);
					A2.setEnabled(false);
				} else if (line.equals(A3.getText())) {
					A3.setBackground(Color.RED);
					A3.setEnabled(false);
				} else if (line.equals(A4.getText())) {
					A4.setBackground(Color.RED);
					A4.setEnabled(false);
				} else if (line.equals(A5.getText())) {
					A5.setBackground(Color.RED);
					A5.setEnabled(false);
				} else if (line.equals(A6.getText())) {
					A6.setBackground(Color.RED);
					A6.setEnabled(false);
				} else if (line.equals(A7.getText())) {
					A7.setBackground(Color.RED);
					A7.setEnabled(false);
				} else if (line.equals(A8.getText())) {
					A8.setBackground(Color.RED);
					A8.setEnabled(false);
				} else if (line.equals(B1.getText())) {
					B1.setBackground(Color.RED);
					B1.setEnabled(false);
				} else if (line.equals(B2.getText())) {
					B2.setBackground(Color.RED);
					B2.setEnabled(false);
				} else if (line.equals(B3.getText())) {
					B3.setBackground(Color.RED);
					B3.setEnabled(false);
				} else if (line.equals(B4.getText())) {
					B4.setBackground(Color.RED);
					B4.setEnabled(false);
				} else if (line.equals(B5.getText())) {
					B5.setBackground(Color.RED);
					B5.setEnabled(false);
				} else if (line.equals(B6.getText())) {
					B6.setBackground(Color.RED);
					B6.setEnabled(false);
				} else if (line.equals(B7.getText())) {
					B7.setBackground(Color.RED);
					B7.setEnabled(false);
				} else if (line.equals(B8.getText())) {
					B8.setBackground(Color.RED);
					B8.setEnabled(false);
				} else if (line.equals(C1.getText())) {
					C1.setBackground(Color.RED);
					C1.setEnabled(false);
				} else if (line.equals(C2.getText())) {
					C2.setBackground(Color.RED);
					C2.setEnabled(false);
				} else if (line.equals(C3.getText())) {
					C3.setBackground(Color.RED);
					C3.setEnabled(false);
				} else if (line.equals(C4.getText())) {
					C4.setBackground(Color.RED);
					C4.setEnabled(false);
				} else if (line.equals(C5.getText())) {
					C5.setBackground(Color.RED);
					C5.setEnabled(false);
				} else if (line.equals(C6.getText())) {
					C6.setBackground(Color.RED);
					C6.setEnabled(false);
				} else if (line.equals(C7.getText())) {
					C7.setBackground(Color.RED);
					C7.setEnabled(false);
				} else if (line.equals(C8.getText())) {
					C8.setBackground(Color.RED);
					C8.setEnabled(false);
				}
			}

		} catch (IOException e1) {
		}
		;
		selectseatframe.setVisible(true);

	}

	public static void seatConfirm() {
		try {
			FileWriter writer;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("TH SarabunPSK", Font.PLAIN, 18)));

			int c = JOptionPane.showConfirmDialog(null, "ยืนยันการเลือกที่นั่ง", "ยืนยันการเลือกที่นั่ง",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (c == JOptionPane.OK_OPTION) {
				JOptionPane.showMessageDialog(null, "เลือกที่นั่งเรียบร้อยแล้ว", "ยืนยันการเลือกที่นั่ง",
						JOptionPane.PLAIN_MESSAGE);
				File file = new File(Selectway.firstPoint + Selectway.lastPoint + Selectway.day + Selectway.month
						+ Selectway.year + Infoinput.ticketType + ".txt");
				writer = new FileWriter(file, true);
				writer.write(seatselected + "\n");
				Receipt recpt = new Receipt();
				writer.close();
				selectseatframe.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "ยกเลิกการเลือกที่นั่ง", "ยกเลิกการเลือกที่นั่ง",
						JOptionPane.PLAIN_MESSAGE);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}