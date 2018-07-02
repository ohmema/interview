package language.file.StandardInAndOut;

import java.io.IOException;
import java.util.Scanner;

public class StandardIn {

	public static void main(String[] args) {
		// getNumberFromStdin();

		// getStringFromStdin();
		try {
			
			do{
				System.out.print((char)System.in.read());
			}while(System.in.available()>0);	
		
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static int getNumberFromStdin() {
		Scanner scanner = null;
		int vin = -1;
		try {
			scanner = new Scanner(System.in);
			do {
				System.out.print("Enter INTEGER: ");
				vin = scanner.nextInt();
				System.out.println(vin);

			} while (!(vin > 0 && vin < 100));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vin;
	}

	static String getStringFromStdin() {
		Scanner scanner = null;
		String vin = null;
		try {
			System.out.println("start");
			scanner = new Scanner(System.in);
			String s = null;

			do {
				s = scanner.next();
				System.out.println(s);
			} while (!s.equals("exit"));

			System.out.println("end");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return vin;
	}

}
