package Busmain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Selectway extends JFrame {

	private JFrame frmReserveticket;
	public static String firstPoint;
	public static String lastPoint;
	public static String day;
	public static String month;
	public static String year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selectway window = new Selectway();
					window.frmReserveticket.setVisible(true);
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Selectway() {
		initialize(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ImageIcon icon) {
		frmReserveticket = new JFrame();
		frmReserveticket.setBackground(new Color(240, 240, 240));
		frmReserveticket.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\66839\\Downloads\\49638C29-6A8D-423C-B261-EC56B0550AF8.png"));
		frmReserveticket.getContentPane().setBackground(new Color(249, 249, 255));
		frmReserveticket.setFont(new Font("Dialog", Font.BOLD, 15));
		frmReserveticket.setTitle("ReserveYourTicket");
		frmReserveticket.setSize(900, 600);
		frmReserveticket.setBounds(100, 100, 990, 503);
		frmReserveticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReserveticket.getContentPane().setLayout(null);

		JComboBox FirstPoint = new JComboBox();
		FirstPoint.setBackground(new Color(255, 255, 255));
		FirstPoint.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		FirstPoint.setBounds(317, 137, 325, 38);
		FirstPoint.setModel(new DefaultComboBoxModel(new String[] { "ขอนแก่น", "อุดรธานี" }));
		firstPoint = (String) FirstPoint.getSelectedItem();
		frmReserveticket.getContentPane().add(FirstPoint);
		FirstPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Firstselect = (String) FirstPoint.getSelectedItem();
				firstPoint = Firstselect;

			}
		});

		JComboBox LastPoint = new JComboBox();
		LastPoint.setBackground(new Color(255, 255, 255));
		LastPoint.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		LastPoint.setBounds(317, 214, 325, 38);
		LastPoint.setModel(new DefaultComboBoxModel(new String[] { "กรุงเทพมหานคร", "อุบลราชธานี", "เชียงใหม่" }));
		lastPoint = (String) LastPoint.getSelectedItem();
		frmReserveticket.getContentPane().add(LastPoint);

		JComboBox dayComboBox = new JComboBox<>();
		dayComboBox.setBackground(new Color(255, 255, 255));
		dayComboBox.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		dayComboBox.setBounds(458, 301, 87, 38);
		dayComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dayselect = (String) dayComboBox.getSelectedItem();
				day = dayselect;

			}
		});

		function upday = new function();
		upday.updateDays(dayComboBox, 31);
		dayComboBox.setSelectedIndex(0);

		frmReserveticket.getContentPane().add(dayComboBox);

		JComboBox MonthComboBox = new JComboBox();
		MonthComboBox.setBackground(new Color(255, 255, 255));
		MonthComboBox.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		MonthComboBox.setModel(new DefaultComboBoxModel(new String[] { "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน",
				"พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤษจิกายน", "ธันวาคม" }));
		MonthComboBox.setBounds(317, 301, 131, 38);
		// MonthComboBox.setSelectedIndex(0);
		MonthComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String monthselect = (String) MonthComboBox.getSelectedItem();
				month = monthselect;
				function daycount = new function();
				int daysInMonth = daycount.getDaysInMonth(monthselect);

				upday.updateDays(dayComboBox, daysInMonth);

			}
		});

		MonthComboBox.setSelectedIndex(0);
		frmReserveticket.getContentPane().add(MonthComboBox);

		JComboBox YearCombobox = new JComboBox();
		YearCombobox.setBackground(new Color(255, 255, 255));
		YearCombobox.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		YearCombobox
				.setModel(new DefaultComboBoxModel(new String[] { "2566", "2567", "2568", "2569", "2570", "2571" }));
		YearCombobox.setBounds(555, 301, 87, 38);

		YearCombobox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String yearselect = (String) YearCombobox.getSelectedItem();
				year = yearselect;

			}
		});
		YearCombobox.setSelectedIndex(0);
		frmReserveticket.getContentPane().add(YearCombobox);

		JLabel lblNewLabel = new JLabel("\u0E15\u0E49\u0E19\u0E17\u0E32\u0E07");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		lblNewLabel.setBounds(317, 108, 67, 29);
		frmReserveticket.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u0E1B\u0E25\u0E32\u0E22\u0E17\u0E32\u0E07");
		lblNewLabel_1.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		lblNewLabel_1.setBounds(317, 186, 87, 29);
		frmReserveticket.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel(
				"\u0E27\u0E31\u0E19\u0E17\u0E35\u0E48\u0E40\u0E14\u0E34\u0E19\u0E17\u0E32\u0E07");
		lblNewLabel_1_1.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(317, 263, 112, 38);
		frmReserveticket.getContentPane().add(lblNewLabel_1_1);
		ImageIcon icon1 = new ImageIcon(
				"C:\\Users\\Admin\\Downloads\\\u0E14\u0E35\u0E44\u0E0B\u0E19\u0E4C\u0E17\u0E35\u0E48\u0E44\u0E21\u0E48\u0E21\u0E35\u0E0A\u0E37\u0E48\u0E2D.jpg");

		JButton btnNewButton = new JButton("ตกลง");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Infoinput info = new Infoinput();
				frmReserveticket.dispose();

			}
		});
		btnNewButton.setBounds(427, 361, 90, 40);
		frmReserveticket.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("New label");
		ImageIcon icon11 = new ImageIcon(("C:\\Users\\66839\\Downloads\\หัวเว็บ.png"));
		lblNewLabel_2.setIcon(new ImageIcon(icon11.getImage().getScaledInstance(976, 83, Image.SCALE_SMOOTH)));
		lblNewLabel_2.setBounds(0, 0, 976, 75);
		frmReserveticket.getContentPane().add(lblNewLabel_2);
		frmReserveticket.setVisible(true);

	}

}