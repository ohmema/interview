import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyRead {
	
	public static int readNaturalNumber(String q)
	{
		BufferedReader readInt = new BufferedReader(new InputStreamReader(System.in));
		int val=-1;
		boolean isNegative=true;
		while(isNegative ){
			val = readInt(readInt, q);
			isNegative = ((val < 0) ? true: false);
		}
		return val;		
	}
	
	
	public static int readInt(BufferedReader readInt, String q)
	{
		String line="";
		int val=0;
		
		boolean condition_NumberFormatException= false;
		boolean condition_IOException=false;
		while(!(condition_NumberFormatException && condition_IOException))		
		{
			condition_NumberFormatException= true;
			condition_IOException=true;
			try {
					System.out.print(q);
					line = readInt.readLine();
					val = Integer.parseInt(line);
							
				} catch (NumberFormatException ex) {
				    	System.err.println("NumberFormatExceptio Error");
				    	condition_NumberFormatException=false;
				} catch (IOException e) {
				    	System.err.println("IO Error ");
				    	condition_IOException=false;
				}
		}
		return val;
	}
}
		
