package Busmain;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class function {
	private static String name;
	private static String phone;
	public int price;
	public int inCorecLength = 0;
	public int inCorecString = 0;
	public static boolean riseproblem = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		String specialChars = "!@#$%^&*-_+=~`:;\"'<>,./?\\|1234567890()";
		boolean isValid = true;
		if (!name.isEmpty()) {
			for (int i = 0; i < name.length(); i++) {
				char nameisVali = name.charAt(i);
				for (int j = 0; j < specialChars.length(); j++) {
					char specialisVali = specialChars.charAt(j);
					if (nameisVali == specialisVali) {
						isValid = false;
						break;
					}
				}
			}
			if (isValid == true) {
				this.name = name;
			} else if (isValid == false) {
				JOptionPane.showMessageDialog(null, "กรุณาใส่ข้อมูลให้ถูกต้อง ไม่ควรมีอักษระพิเศษ", "คำเตือน",
						JOptionPane.WARNING_MESSAGE);
				riseproblem = true;
				Infoinput.nameinfo += 1;
				this.name = "";
			}
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		boolean isValid = true;
		if (!phone.isEmpty()) {
			for (int i = 0; i < phone.length(); i++) {
				if (!Character.isDigit(phone.charAt(i))) {
					isValid = false;
					Infoinput.phoneinfo += 1;
					inCorecString += 1;
					break;
				}
			}
			if (phone.length() != 10 && inCorecString == 0) {
				JOptionPane.showMessageDialog(null, "กรุณาใส่เบอร์โทรให้ครบถ้วน", "คำเตือน", JOptionPane.WARNING_MESSAGE);
				Infoinput.phoneinfo += 1;
				inCorecLength += 1;
			}
			if (isValid == true) {
				this.phone = phone;
			} else if (isValid == false && riseproblem == true && inCorecLength != 0 && inCorecString != 0) {
				JOptionPane.showMessageDialog(null, "กรุณาใส่ข้อมูลให้ถูกต้อง", "คำเตือน", JOptionPane.WARNING_MESSAGE);
				this.phone = "";
				Infoinput.nameinfo += 1;
			}
		}
	}

	public int ticketType(String typeseat) {
		switch (typeseat) {
		case "ชั้นประหยัด":
			price = 250;
			return price;
		case "ชั้นธุรกิจ":
			price = 300;
			return price;
		case "ชั้นหนึ่ง":
			price = 500;
			return price;
		}
		return price;
	}

	public static int getDaysInMonth(String monthselect) {
		switch (monthselect) {
		case "มกราคม":
		case "มีนาคม":
		case "พฤษภาคม":
		case "กรกฎาคม":
		case "สิงหาคม":
		case "ตุลาคม":
		case "ธันวาคม":
			return 31;
		case "เมษายน":
		case "มิถุนายน":
		case "กันยายน":
		case "พฤศจิกายน":
			return 30;
		case "กุมภาพันธ์":
			return 28;
		default:
			return 0;
		}
	}

	public static void updateDays(JComboBox dayComboBox, int numDays) {
		dayComboBox.removeAllItems();
		for (int i = 1; i <= numDays; i++) {
			dayComboBox.addItem(Integer.toString(i));
		}
	}

}
