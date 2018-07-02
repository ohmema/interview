package spreadsheetNumbers;

import java.util.Scanner;


public class SpreadSheetToNumber {

	public static void main(String[] args) {
		System.out.print("Enter spreadsheat(\"AB\") : ");
		Scanner sc = new Scanner (System.in);
		String sp = sc.next();
		int result = 0;
		
//		System.out.format("sp is %s and length is %d\n", sp, sp.length());
		
		for(int i =0 ; i<sp.length();i++)
		{
//			System.out.format("i is %d, char is %c\n", i,sp.charAt(i));
//			System.out.format("Math.pow(26, sp.length()-%d-1) = %f\n", i, Math.pow(26, sp.length()-i-1));
			result += ((int)Math.pow(26, sp.length()-i-1))*(Character.toUpperCase(sp.charAt(i))-'A'+1);
//			System.out.format("result is %d\n",result);
		}
		
		System.out.format("the Number is %d", result);
	}

}
