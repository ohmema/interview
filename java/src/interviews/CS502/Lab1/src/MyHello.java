public class MyHello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (String word : args) {
			System.out.print(word + " ");
		}

		StringBuffer sb = new StringBuffer("abcdefg");
		sb.deleteCharAt(0);
		sb.delete(0,2);
		System.out.print(sb);
		
		// System.out.println(" MAX Integer: " + Integer.MAX_VALUE);
		// System.out.println(" MIN Integer: " + Integer.MIN_VALUE);
		// System.out.println(" MAX double: " + Double.MAX_VALUE);
		// System.out.println(" MIN double: " + Double.MIN_VALUE);
	}

}
