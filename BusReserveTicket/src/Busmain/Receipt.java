package Busmain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Receipt {

	private JFrame Receiptframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt window = new Receipt();
					window.Receiptframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Receipt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		function datasum = new function();
		Receiptframe = new JFrame();
		Receiptframe.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\66839\\Downloads\\49638C29-6A8D-423C-B261-EC56B0550AF8.png"));
		Receiptframe.setFont(new Font("TH SarabunPSK", Font.PLAIN, 12));
		Receiptframe.setTitle("ใบเสร็จ");
		Receiptframe.setBackground(new Color(240, 240, 240));
		Receiptframe.setBounds(100, 100, 365, 630);
		Receiptframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Receiptframe.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("บริษัท จริงใจไม่จิงโจ้ทัวร์");
		lblNewLabel.setFont(new Font("TH SarabunPSK", Font.BOLD, 26));
		lblNewLabel.setBounds(95, 77, 181, 30);
		Receiptframe.getContentPane().add(lblNewLabel);

		JLabel date = new JLabel("วันที่");
		date.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		date.setBounds(60, 117, 29, 30);
		Receiptframe.getContentPane().add(date);

		JLabel start = new JLabel("ต้นทาง");
		start.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		start.setBounds(49, 149, 41, 22);
		Receiptframe.getContentPane().add(start);

		JLabel end = new JLabel("ปลายทาง");
		end.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		end.setBounds(34, 181, 55, 22);
		Receiptframe.getContentPane().add(end);

		JLabel name_01 = new JLabel("ชื่อ-นามสกุล");
		name_01.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		name_01.setBounds(19, 213, 70, 25);

		Receiptframe.getContentPane().add(name_01);

		JLabel seatNO = new JLabel("ที่นั่ง");
		seatNO.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		seatNO.setBounds(241, 213, 25, 25);
		Receiptframe.getContentPane().add(seatNO);

		JLabel type = new JLabel("ประเภทที่นั่ง");
		type.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		type.setBounds(19, 273, 70, 32);
		Receiptframe.getContentPane().add(type);

		JLabel total = new JLabel("รวมทั้งหมด");
		total.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		total.setBounds(19, 328, 85, 22);
		Receiptframe.getContentPane().add(total);

		JLabel conditions = new JLabel("เงื่อนไขการเดินทาง");
		conditions.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		conditions.setBounds(19, 385, 107, 20);
		Receiptframe.getContentPane().add(conditions);

		JLabel lblNewLabel_2 = new JLabel("");
		ImageIcon icon11 = new ImageIcon(("C:\\Users\\66839\\Downloads\\หัวเว็บ.png"));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\66839\\Downloads\\351_67.png"));
		lblNewLabel_2.setBounds(0, 0, 351, 67);
		Receiptframe.getContentPane().add(lblNewLabel_2);

		String firstway = Selectway.firstPoint;
		JLabel first = new JLabel("");
		first.setText(firstway);
		first.setFont(new Font("TH SarabunPSK", Font.PLAIN, 20));
		first.setBounds(95, 149, 194, 23);
		Receiptframe.getContentPane().add(first);

		String dayshow = Selectway.day;
		String monthshow = Selectway.month;
		String yearshow = Selectway.year;

		JLabel date_1 = new JLabel("");
		date_1.setText(dayshow + "/" + monthshow + "/" + yearshow);
		date_1.setFont(new Font("TH SarabunPSK", Font.PLAIN, 20));
		date_1.setBounds(91, 124, 194, 19);
		Receiptframe.getContentPane().add(date_1);

		String lasttway = Selectway.lastPoint;
		JLabel last = new JLabel("");
		last.setText(lasttway);
		last.setFont(new Font("TH SarabunPSK", Font.PLAIN, 20));
		last.setBounds(95, 181, 194, 22);
		Receiptframe.getContentPane().add(last);

		String name_surname = datasum.getName();

		JLabel name_1 = new JLabel("");
		name_1.setText(name_surname);
		name_1.setFont(new Font("TH SarabunPSK", Font.PLAIN, 20));
		name_1.setBounds(95, 213, 140, 25);
		Receiptframe.getContentPane().add(name_1);

		String seatpoint = selectseat.seatselected;
		JLabel seat_no = new JLabel("");
		seat_no.setText(seatpoint);
		seat_no.setFont(new Font("TH SarabunPSK", Font.PLAIN, 20));
		seat_no.setBounds(276, 213, 65, 25);
		Receiptframe.getContentPane().add(seat_no);

		String ticket_type = Infoinput.ticketType;

		JLabel type_se = new JLabel("");
		type_se.setText(ticket_type);
		type_se.setFont(new Font("TH SarabunPSK", Font.PLAIN, 20));
		type_se.setBounds(95, 277, 140, 25);
		Receiptframe.getContentPane().add(type_se);

		int totalprice = Infoinput.price;
		String totalprice1 = Integer.toString(totalprice);
		JLabel total_money = new JLabel("");
		total_money.setText(totalprice1);
		total_money.setFont(new Font("TH SarabunPSK", Font.PLAIN, 25));
		total_money.setBounds(111, 330, 70, 19);
		Receiptframe.getContentPane().add(total_money);

		JLabel lblNewLabel_3 = new JLabel(
				"<html>1.ซื้อตั๋วแล้ว ไม่รับคืน<br>2.สัมภาระติดตัวคนละไม่เกิน 2 ชิ้น น้ำหนักรวมไม่เกิน 20 กก<br>หากสูญหาญ บริษัทฯ จะรับผิดชอบตัวจริงแต่ไม่เกิน 400 บาท"
						+ "<br>แต่จะไม่รับผิดชอบสัมภาระและของมีค่าที่ท่านติดตัวขึ้นบนรถ ไม่ว่ากรณีใดๆ<br>3.เลื่อนการเดินทาง กรุณาติดต่อพนักงานขายตั๋วก่อนเวลารถออก 4 ชม. \r\n"
						+ "มิฉะนั้นจะถือว่าสละสิทธิ์ เรียกร้องเงินคืนไม่ได้ และต้องใช้สิทธิ์ภายใน\r\n"
						+ "30 วัน กรุณานำตั๋วฉบับเดิมมาเลื่อนการเดินทาง</html>");
		lblNewLabel_3.setFont(new Font("TH SarabunPSK", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(19, 403, 317, 165);
		Receiptframe.getContentPane().add(lblNewLabel_3);

		JLabel name_01_1 = new JLabel("เบอร์โทรศัพท์");
		name_01_1.setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
		name_01_1.setBounds(14, 246, 75, 25);
		Receiptframe.getContentPane().add(name_01_1);

		String phone_number = datasum.getPhone();
		JLabel phoneNum = new JLabel((String) null);
		phoneNum.setText(phone_number);
		phoneNum.setFont(new Font("TH SarabunPSK", Font.PLAIN, 20));
		phoneNum.setBounds(95, 248, 140, 25);
		Receiptframe.getContentPane().add(phoneNum);

		JButton btnNewButton = new JButton("จองอีกครั้ง");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selectway reverse2 = new Selectway();
				Receiptframe.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("TH SarabunPSK", Font.BOLD, 15));
		btnNewButton.setBounds(229, 358, 85, 21);
		Receiptframe.getContentPane().add(btnNewButton);

		JLabel total_1 = new JLabel("บาท");
		total_1.setFont(new Font("TH SarabunPSK", Font.BOLD, 25));
		total_1.setBounds(165, 328, 30, 22);
		Receiptframe.getContentPane().add(total_1);
		Receiptframe.setVisible(true);
	}
}