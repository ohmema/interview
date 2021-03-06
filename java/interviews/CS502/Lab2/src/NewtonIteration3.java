import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class NewtonIteration3 {

	/**
	 * Reports the non-negative square root of {@code x} to within relative
	 * error {@code epsilon}.
	 * 
	 * @param x
	 *            number whose square root is to be computed
	 * @param epsilon
	 *            maximum relative error of result
	 * @requires <pre>
	 * {@code
	 * x > 0  and  epsilon > 0
	 * }
	 * </pre>
	 * @ensures <pre>
	 * {@code
	 * sqrt >= 0  and
	 * |sqrt - x^(1/2)| / x^(1/2) <= epsilon
	 * 
	 * if x=0, sqrt returns 1
	 * }
	 * </pre>
	 */
	private static double sqrt(double x, double epsilon) {
		double result = x;
		double epsilon2 = epsilon * epsilon;
		// int iteration = 0;
		// System.out.println(" first iter" + (result * result - x) / x);
		while ((Math.abs(result * result - x)) / x > epsilon2) {
			result = (result + x / result) / 2;
			// System.out.println(result);
			// iteration++;
		}
		// System.out.println("iteration : " + iteration);
		return result;
	}

	public static void main(String[] args) {
		SimpleReader input = new SimpleReader1L();
		SimpleWriter output = new SimpleWriter1L();
		while (true) {
			output.print("Calculate another square root? (y/n): ");

			String response = input.nextLine();
			if (!response.equals("y")) {
				break;
			}
			output.print("  x (x>=0) = ");
			double x = input.nextDouble();
			double e = -1.0;
			while (e <= 0) {
				output.print("  e (e>0) = ");
				e = input.nextDouble();
			}
			output.println("  sqrt(x) = " + sqrt(x, e) + " Math.sqrt(x) ="
					+ Math.sqrt(x));
			// System.out.println("  sqrt(x) = " + sqrt2(x, 1));
		}

		output.println("Goodbye!");

	}
}
