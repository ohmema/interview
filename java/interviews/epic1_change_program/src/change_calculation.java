import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class change_calculation {
	static double deno[]={20.0,10.0,5.0,1.0,0.25,0.10,0.05,0.01};
	
		
		public static double getChange(double div, double change){
	
			return Math.round( (change*100)%(div*100) )*0.01;
			//return change%(div); // Not working for double presision 2.05%1 =2
		}
		
		public static void main(String [ ] args)
		{
			Map <Double, Integer> hash = new HashMap<Double, Integer>();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
			Scanner reader = new Scanner(System.in);
			String string="";
			try{
				System.out.print("Enter Double: ");
//				string = reader.readLine();
				string = reader.nextLine();
			}
			catch(Exception e){
				System.err.print("errror in BufferedReader\n");		
			
			}
			double change = Double.parseDouble(string); //236.46;
			
			for( int i =0;i<deno.length;i++)
			{
				double temp = change;
				hash.put(deno[i], (int)(temp/deno[i]));	
				change = getChange(deno[i],temp);
				
			}
			
			
			for( Iterator<Double> it = hash.keySet().iterator();it.hasNext();)
			{
				Double key =  it.next();
				System.out.printf("%.2f: %d\n", key, hash.get(key));
			
			}
			
			System.out.printf("\n\n");
			for(Double key: hash.keySet())
			{
				System.out.printf("%.2f: %d\n", key, hash.get(key));
			}
			
		}
		
		
		
}
