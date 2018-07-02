package practice;

import Lab4.Text;
import Lab4.Text1L;

public class practice implements insface {
	@Override
	public void dosome() {

	}

	public static void main(String[] args) {
		/*
		 * assert Practice
		 * **************************************************************
		 * SimpleReader input = new SimpleReader1L(); SimpleWriter output = new
		 * SimpleWriter1L(); try { StringBuffer a = new StringBuffer("hello");
		 * System.out.println(a);
		 * 
		 * while (true) {
		 * output.print("Calculate another square root? (y/n): "); String
		 * response = input.nextLine(); if (!response.equals("y")) { break; }
		 * output.print("  x = "); double x = input.nextDouble(); assert x >= 0
		 * : "x= " + x; } } catch (Exception e) { System.out.println(e); }
		 */

		/*
		 * Instanceof practice
		 * ****************************************************************
		 * insface ss = new practice();
		 * 
		 * if (ss instanceof insface) { System.out.print("yes"); } else {
		 * System.out.print("no"); }
		 * 
		 * if (ss instanceof practice) { System.out.print("yes"); } else {
		 * System.out.print("no"); }
		 */

		/*
		 * No instantiation for abstract class Text aa = new TextSecondary();
		 * ****************************************************** Text bb = new
		 * Text1L("hello"); System.out.println("hascode(): " + bb.hashCode());
		 * System.out.println("toString(): " + bb.toString()); Text aa = new
		 * Text1L("hello"); System.out.println("hascode(): " + aa.hashCode());
		 * 
		 * System.out.println("toString(): " + aa.toString()); if
		 * (aa.equals(bb)) { System.out.println("aa is eauals to bb"); }
		 */

		Text aa = new Text1L("hello chang you are greate!!!");
		Text bb = new Text1L();
		aa.removeFirstWord(new Text1L(" "), bb);
		System.out.println(aa + " \\" + bb);
	}
}