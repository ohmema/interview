import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class HW2 {

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
	 * }
	 * </pre>
	 */
	private static double sqrt(double x, double epsilon) {
		double result = x;
		double epsilon2 = epsilon * epsilon;
		int iteration = 0;
		while ((result * result - x) / x > epsilon2) {
			result = (result + x / result) / 2;
			System.out.println(result);
			iteration++;
		}
		// System.out.println("iteration : " + iteration);
		return result;
	}

	private static double sqrt2(double x, double epsilon) {
		double result = x;
		double epsilon2 = epsilon * epsilon;
		int iteration = 0;
		while ((result * result - x) > epsilon) {
			result = (result + x / result) / 2;
			System.out.println(result);
			iteration++;
		}
		// System.out.println("iteration : " + iteration);
		return result;
	}

	/**
	 * Solution to Newton iteration square root problem.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		SimpleReader input = new SimpleReader1L();
		SimpleWriter output = new SimpleWriter1L();
		while (true) {
			output.print("Calculate another square root? (y/n): ");
			String response = input.nextLine();
			if (!response.equals("y")) {
				break;
			}
			output.print("  x = ");
			double x = input.nextDouble();
			output.println("  sqrt(x) = " + sqrt(x, 0.0000001));
			// System.out.println("  sqrt(x) = " + sqrt2(x, 1));
		}

		output.println("Goodbye!");
	}
}