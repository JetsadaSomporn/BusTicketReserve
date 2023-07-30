package Busmain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Infoinput {

	private JFrame frmInputform;
	public static int price = 0;
	public static String ticketType;
	public static int nameinfo = 0;
	public static int phoneinfo = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infoinput window = new Infoinput();
					window.frmInputform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Infoinput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInputform = new JFrame();
		frmInputform.getContentPane().setBackground(new Color(249, 249, 255));
		frmInputform.setTitle("Bus Reservation Ticket");
		frmInputform.setSize(900, 600);
		// frmInputform.setBounds(100, 100, 990, 503);
		frmInputform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInputform.getContentPane().setLayout(null);

		JLabel label = new JLabel("ชื่อ-นามสกุล");
		label.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		label.setBounds(254, 167, 103, 36);
		frmInputform.getContentPane().add(label);
		JTextField nameField = new JTextField();
		nameField.setForeground(new Color(0, 0, 0));
		nameField.setBackground(new Color(255, 255, 255));
		nameField.setFont(new Font("TH SarabunPSK", Font.PLAIN, 28));
		nameField.setBounds(367, 167, 237, 38);
		frmInputform.getContentPane().add(nameField);

		JLabel label_1 = new JLabel("เบอร์โทรศัพท์");
		label_1.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		label_1.setBounds(239, 231, 118, 36);
		frmInputform.getContentPane().add(label_1);
		JTextField phoneField = new JTextField();
		phoneField.setBackground(new Color(255, 255, 255));
		phoneField.setFont(new Font("TH SarabunPSK", Font.PLAIN, 28));
		phoneField.setBounds(367, 232, 237, 36);
		frmInputform.getContentPane().add(phoneField);

		JLabel label_2 = new JLabel("ประเภทที่นั่ง");
		label_2.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		label_2.setBounds(254, 294, 103, 36);
		frmInputform.getContentPane().add(label_2);

		JComboBox ticketTypeComboBox = new JComboBox();
		ticketTypeComboBox.setBackground(new Color(255, 255, 255));
		ticketTypeComboBox.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		ticketTypeComboBox
				.setModel(new DefaultComboBoxModel(new String[] { "ชั้นประหยัด", "ชั้นธุรกิจ", "ชั้นหนึ่ง" }));
		ticketTypeComboBox.setBounds(367, 295, 234, 36);
		frmInputform.getContentPane().add(ticketTypeComboBox);

		JLabel label_3 = new JLabel("ประกันที่นั่ง");
		label_3.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		label_3.setBounds(254, 360, 103, 36);
		frmInputform.getContentPane().add(label_3);
		JCheckBox insuranceCheckBox = new JCheckBox();
		insuranceCheckBox.setBackground(new Color(249, 252, 255));
		insuranceCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		insuranceCheckBox.setBounds(370, 360, 234, 43);
		frmInputform.getContentPane().add(insuranceCheckBox);

		JButton reserveButton = new JButton("เลือกที่นั่ง");

		reserveButton.setBackground(UIManager.getColor("Button.background"));
		reserveButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		reserveButton.setBounds(367, 436, 150, 45);
		reserveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int insurancecheck = 0;
				nameinfo = 0;
				phoneinfo = 0;
				ticketType = (String) ticketTypeComboBox.getSelectedItem();
				boolean insurance = insuranceCheckBox.isSelected();

				function seatprice = new function();
				price = seatprice.ticketType(ticketType);
				if (insurance == true) {
					insurancecheck = price + 20;
					price = insurancecheck;
				}

				if (e.getSource() == reserveButton) {
					function datavali = new function();
					datavali.setName(nameField.getText());
					datavali.setPhone(phoneField.getText());

					if (nameField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "กรุณาใส่ข้อมูลให้ครบถ้วน", "คำเตือน",
								JOptionPane.WARNING_MESSAGE);
						nameinfo += 1;
					} else if (phoneField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "กรุณาใส่เบอร์โทรให้ครบถ้วน", "คำเตือน",
								JOptionPane.WARNING_MESSAGE);
						phoneinfo += 1;
					}
					/*
					 * if(nameField.getText().length()!=10 && function.ricsproblem == true) {
					 * JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ถูกต้อง", "คำเตือน",
					 * JOptionPane.WARNING_MESSAGE); }
					 */

					else if (nameinfo == 0 && phoneinfo == 0) {
						selectseat seat = new selectseat();
						frmInputform.setVisible(false);
					}
				}

			}
		});
		frmInputform.getContentPane().add(reserveButton);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 886, 88);
		ImageIcon icon = new ImageIcon(("C:\\Users\\66839\\Downloads\\หัวเว็บ.png"));
		lblNewLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(886, 88, Image.SCALE_SMOOTH)));
		frmInputform.getContentPane().add(lblNewLabel);

		JLabel lblDiv = new JLabel("กรุณากรอกข้อมูล");
		lblDiv.setFont(new Font("TH SarabunPSK", Font.BOLD, 35));
		lblDiv.setBounds(367, 112, 172, 36);
		frmInputform.getContentPane().add(lblDiv);

		JButton btnNewButton = new JButton("ย้อนกลับ");
		btnNewButton.setBounds(10, 98, 92, 50);
		btnNewButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selectway reverse = new Selectway();
				frmInputform.setVisible(false);
			}
		});
		frmInputform.getContentPane().add(btnNewButton);
		frmInputform.setVisible(true);

	}
}
