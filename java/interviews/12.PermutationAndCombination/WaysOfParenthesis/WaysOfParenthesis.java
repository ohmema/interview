package WaysOfParenthesis;

import java.util.HashSet;
import java.util.Set;

public class WaysOfParenthesis {

	public static void main(String[] args) {
		String expression = "1^0|0|1";
		Set<String> set = new HashSet<String>();
		Paren(expression, 0, expression.length() / 2, expression.length() / 2,
				set, new StringBuffer());

		for (String s : set) {
			System.out.println(s);
		}
		System.out.println(set.size());
	}

	static void Paren(String s, int k, int leftP, int rightP, Set<String> set,
			StringBuffer sb) {
		if (rightP == 0 || k == s.length()) {
			set.add(sb.toString());
			return;
		}

		if (s.charAt(k) == '0' || s.charAt(k) == '1') {
			if (leftP > 0 && k < s.length()) {
				sb.append("(" + s.charAt(k));
				Paren(s, k + 1, leftP - 1, rightP, set, sb);
				sb.setLength(sb.length() - 2);
			}
		} else {

			if (leftP < rightP && k < s.length()) {
				sb.append(")" + s.charAt(k));
				Paren(s, k + 1, leftP, rightP - 1, set, sb);
				sb.setLength(sb.length() - 2);
			} else if (leftP < rightP && k >= s.length()) {
				sb.append(")");
				Paren(s, k, leftP, rightP - 1, set, sb);
				sb.setLength(sb.length() - 1);

			}
		}
	}

}
