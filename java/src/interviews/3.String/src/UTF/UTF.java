package UTF;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class UTF {

	public static void main(String[] args) {

		String s = "0Aa가다 こんにちは";
//		System.out.println(getUTF(s));
		
			//printKorean();
			
		printAllUnicode();
			
		

	}

	public static String getUTF(String s) {
		byte[] stringBytes = s.getBytes();

		for (byte i : stringBytes) {
			System.out.print(i + " ");
		}
		System.out.println();

		String sUTF = "";
		try {
			sUTF = new String(stringBytes, "UTF-8");
			stringBytes = sUTF.getBytes();
			for (byte i : stringBytes) {
				System.out.print(i + " ");
			}

		} catch (Exception e) {

		}
		return null;
	}

	public static void printKorean() {

		System.out.println("\u4e16\u754c\u4f60\u597d\uff01");
		System.out.println("\u30ac00");
		String go_hello = "안녕하세요 \nんにちは";
		System.out.printf(go_hello);
	}

	public static void printAllUnicode() {
		for (int i = 3189760 ; i < 3201000; i++) {
			String hex = Integer.toHexString(i);
			System.out.print(hex + " = " + (char) i + " ");
			if (i % 600 == 0)
				System.out.println();
		}
	}
}
