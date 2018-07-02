package phoneNumberDecoding;

import java.util.ArrayList;

public class PhoneNumberDecoding {
	static final char[][] Words = { { '0'}, { '1' },
			{ 'A', 'B', 'C' }, { 'D', 'E', 'f' }, { 'g', 'H', 'I' },
			{ 'J', 'K', 'L' }, { 'M', 'N', 'o' }, { 'P', 'R', 'S' },
			{ 'T', 'U', 'V' }, { 'W', 'X', 'Y' } };

	public static void main(String[] args) {
		String phoneNumber = "1234";
		// int[] phoneNumber = {6,1};
		ArrayList<String> al = PhoneNumberConversion(new ArrayList<String>(),
				phoneNumber, new StringBuffer(), 0);

		for (String a : al) {
			System.out.println(a);
		}
	}

	static ArrayList<String> PhoneNumberConversion(ArrayList<String> al,
			String phone, StringBuffer sb, int start) {
		if (start == phone.length()) {
			al.add(sb.toString());
			return al;
		}

		int index = Integer.parseInt("" + phone.charAt(start));
		if (phone.charAt(start) != '1' && phone.charAt(start) != '0') {

			for (int i = 0; i < 3; i++) {

				PhoneNumberConversion(al, phone, sb.append(Words[index][i]),
						start + 1);
				sb.setLength(sb.length() - 1);
			}
		} else {
			PhoneNumberConversion(al, phone, sb.append(Words[index][0]),
					start + 1);
			sb.setLength(sb.length() - 1);
		}
		return al;
	}
}

//
// public static void main(String[] args) {
// String num = "100";
// ArrayList<String> al = new ArrayList<String>();
//
// al = decode(al, num, new StringBuffer(), 0);
//
// for (String a : al) {
// System.out.println(a);
// }
// }
//
// public static ArrayList<String> decode(ArrayList<String> al, String num,
// StringBuffer decoded_number, int index) {
// if (index == num.length()) {
// // System.out.println(decoded_number.toString());
// al.add(decoded_number.toString());
// return al;
// }
//
// for (int i = index; i < num.length(); i++) {
// if (num.charAt(i) == '2') {
// decode(al, num, decoded_number.append('A'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
//
// decode(al, num, decoded_number.append('B'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
//
// decode(al, num, decoded_number.append('C'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else if (num.charAt(i) == '3') {
// decode(al, num, decoded_number.append('D'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
//
// decode(al, num, decoded_number.append('E'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
//
// decode(al, num, decoded_number.append('F'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else if (num.charAt(i) == '4') {
// decode(al, num, decoded_number.append('G'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('H'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('I'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else if (num.charAt(i) == '5') {
// decode(al, num, decoded_number.append('J'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('K'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('L'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else if (num.charAt(i) == '6') {
// decode(al, num, decoded_number.append('M'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('N'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('O'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else if (num.charAt(i) == '7') {
// decode(al, num, decoded_number.append('P'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('Q'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('R'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('S'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else if (num.charAt(i) == '8') {
// decode(al, num, decoded_number.append('T'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('U'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('V'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else if (num.charAt(i) == '9') {
// decode(al, num, decoded_number.append('W'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('X'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('Y'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// decode(al, num, decoded_number.append('Z'), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// } else {
// decode(al, num, decoded_number.append(num.charAt(i)), index + 1);
// decoded_number = new
// StringBuffer(decoded_number.substring(0,decoded_number.length()-1));
// i++;
// }
// }
//
// return al;
// }
// }
