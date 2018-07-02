package Facebook;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WaysOfChanges {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		changes(60, new StringBuffer(), set);
		optimalChanges(60, new StringBuffer(), set, 1);
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println(set.size());

	}

	// T(n) = T(n-1) + T(n-5) + T(n-10) + T(n-25)
	// t(n) = 4^n
	// if n == 69 // wait few minutes
	static void changes(int n, StringBuffer sb, Set<String> set) {
		if (n == 0) {
			char[] charArray = sb.toString().toCharArray();
			Arrays.sort(charArray);
			set.add(new String(charArray));
			// set.add(sb.toString());
			return;
		}
		if (n < 0)
			return;

		sb.append("P");
		changes(n - 1, sb, set);
		sb.setLength(sb.length() - 1);

		sb.append("N");
		changes(n - 5, sb, set);
		sb.setLength(sb.length() - 1);

		sb.append("D");
		changes(n - 10, sb, set);
		sb.setLength(sb.length() - 1);

		sb.append("Q");
		changes(n - 25, sb, set);
		sb.setLength(sb.length() - 1);

	}

	static void optimalChanges(int n, StringBuffer sb, Set<String> set,
			int nextCoin) {
		if (n == 0) {
			set.add(sb.toString());
			return;
		}
		if (n < 0)
			return;

		if (nextCoin >= 25) {
			sb.append("Q");
			optimalChanges(n - 25, sb, set, 25);
			sb.setLength(sb.length() - 1);

			if (nextCoin >= 10) {
				sb.append("D");
				optimalChanges(n - 10, sb, set, 10);
				sb.setLength(sb.length() - 1);

				if (nextCoin >= 5) {
					sb.append("N");
					optimalChanges(n - 5, sb, set, 5);
					sb.setLength(sb.length() - 1);

					sb.append("P");
					changes(n - 1, sb, set);
					sb.setLength(sb.length() - 1);
				}
			}
		}
	}

}
