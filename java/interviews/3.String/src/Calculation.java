public class Calculation {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		String s = "3+4+5-6*7";
//		try {
//			getNumber(new StringBuffer("3"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String s = "1+2*3/6*3-2-";
		int cal=0;
		try {
			cal = calculation(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(s + " = " + cal);
	}

	static int calculation(String s) throws Exception {
		StringBuffer sb = new StringBuffer(s);
		return calculation(sb);
	}

	static int calculation(StringBuffer sb) throws Exception {

		int left = getNumber(sb);
		while (sb.length() > 1) { //Mistake
			char op = getOp(sb);

			if (op == '*' || op == '/') {
				int right = getNumber(sb);
				left = compute(op, left, right);
			} else if (op == '+' || op == '-') {
				left = compute(op, left, calculation(sb));
//				System.out.println(left+ " : " + sb);
			} else {
				System.out.println("Not Valid operland");
			}
		}
		return left;
	}

	static int compute(char op, int left, int right) throws Exception{
		
		int ret = 0;
		switch (op) {
		case '+':
			ret = left + right;
			break;
		case '-':
			ret = left - right;
			break;
		case '*':
			ret = left * right;
			break;
		case '/':
			ret = left / right;
			break;
		default:
			throw new Exception("Not Valid Operland");
		
		}
		return ret;
	}

	static int getNumber(StringBuffer sb) throws Exception {
		int i = 0;
		while (i < sb.length() && Character.isDigit(sb.charAt(i)))//Mistakes
			i++;
		if (i == 0)
			throw new Exception("No Number");
		int number = Integer.parseInt(sb.substring(0, i));
		sb.delete(0, i);

		return number;
	}

	static char getOp(StringBuffer sb) throws Exception {
		char s = sb.charAt(0);
		if (s != '+' && s != '*' && s != '/' && s != '-')
			throw new Exception("NoT valid operland");
		sb.deleteCharAt(0);
		return s;
	}

}
