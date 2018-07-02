import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class NewtonIteration6 {

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
	private static double sqrt(double x, double r, double epsilon) {
		double result = r;
		double epsilon2 = epsilon * epsilon;
		int iteration = 0;
		// System.out.println(" x " + x + " r " + r + " e " + epsilon);
		// System.out.println(" first iter" + Math.abs(result * result - x) /
		// x);
		while ((Math.abs(result * result - x)) / x > epsilon2) {
			result = (result + x / result) / 2;
			System.out.println("Iteration " + iteration++ + " result: "
					+ result);
			// iteration++;

		}
		// System.out.println("iteration : " + iteration);
		return result;
	}

	public static void main(String[] args) {
		SimpleReader input = new SimpleReader1L();
		SimpleWriter output = new SimpleWriter1L();
		if (args == null) {
			System.err.println("Error: NO Main arguments inserted");
			System.err.println("Program terminates");
			return;
		}
		double e = Double.parseDouble(args[0]);
		System.out.println("double e " + e);
		while (true) {
			output.print("  x (x<0, terminate) = ");
			double x = input.nextDouble();
			if (x < 0) {
				output.println("Goodbye!");
				return;
			}

			double r = -1;
			do {
				output.print("  r ( r>=2) = ");

				r = input.nextDouble();
			} while (r < 2);

			output.println("  sqrt(x) = " + sqrt(x, r, e) + " Math.sqrt(x) ="
					+ Math.sqrt(x));

		}

	}
}
