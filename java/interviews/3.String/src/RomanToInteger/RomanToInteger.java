package RomanToInteger;

public class RomanToInteger {

	public enum Roman {
		I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
		private int value;

		private Roman(int value) {
			this.value = value;
		}

		public int get() {
			return this.value;
		}

		public static int getValue(char c) throws Exception {
			if (c == 'I')
				return 1;
			else if (c == 'V')
				return 5;
			else if (c == 'X')
				return 10;
			else if (c == 'L')
				return 50;
			else if (c == 'C')
				return 100;
			else if (c == 'D')
				return 500;
			else if (c == 'M')
				return 1000;
			else
				throw new Exception("error");
		}
	}

	public static void main(String[] args) {
		// IXI

		String test1 = "DXIX";
		try {
			System.out.println(test1 + "   : " + RomanToInteger(test1));
		} catch (Exception e) {
			System.out.println(test1 + "   : Error");
		}
	}

	//

	public static int RomanToInteger(String s) throws Exception {
		int previousNum = Roman.M.get(), num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i != s.length() - 1) {
				if (Roman.getValue(s.charAt(i)) < Roman.getValue(s
						.charAt(i + 1))) {
					if (Roman.getValue(s.charAt(i + 1)) == 'X'
							|| Roman.getValue(s.charAt(i + 1)) == 'V') {
						if (Roman.getValue(s.charAt(i)) != 'I')
							throw new Exception("error");

					} else if (Roman.getValue(s.charAt(i + 1)) == 'L'
							|| Roman.getValue(s.charAt(i + 1)) == 'C') {
						if (Roman.getValue(s.charAt(i)) != 'X')
							throw new Exception("error");

					}

					else if (Roman.getValue(s.charAt(i + 1)) == 'D'
							|| Roman.getValue(s.charAt(i + 1)) == 'M') {
						if (Roman.getValue(s.charAt(i)) != 'C')
							throw new Exception("error");

					} 
					else if (i < s.length()-2)
					{
						if(Roman.getValue(s.charAt(i)) <= Roman.getValue(s.charAt(i + 2)))
						{
							throw new Exception("error");
						}
					}
					else {
						
						num += Roman.getValue(s.charAt(i + 1))
								- Roman.getValue(s.charAt(i));
						i++; // Missed--> compute two characters at once.
					}
				} else
					num += Roman.getValue(s.charAt(i));
			} else
				num += Roman.getValue(s.charAt(i));

		}
		return num;
	}
}
