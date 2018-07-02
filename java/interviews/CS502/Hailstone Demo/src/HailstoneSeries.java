
import java.util.TreeSet;
/**
 * 
 * @author chang
 *
 */
public class HailstoneSeries {

		final static int DEBUG = 2;
		final static int FACTOR =3;
	
	/**
	 * @param args Command-line argument
	 */
	public static void main(String[] args) {
		TreeSet<Object> sortedset = new TreeSet<Object>();
		
		int num= MyRead.readNaturalNumber("Enter positive int: ");
		System.out.println("num = " + num);
		sortedset.add(num);
		while(num > 1)
		{
			if(num%2==0)
				num = num/2;
			else
				num = (FACTOR*num+1)/2;
			sortedset.add(num);
			if(num > Integer.MAX_VALUE )
				System.out.println("out of bounce");
			System.out.println("num = "+num);
		}
			
		System.out.println("The Largest Number for Hailstone is "+ sortedset.last());	
	
		
	
	}

}
