public class CharPractice {
	public static void main(String[] args) {
		
		  for (int i = 32; i < 127; i++) { 
//			  System.out.print(i + " "+ (char)i); 

			  if(i >= 'a' && i<= 'z')
				  System.out.print(i + " "+ (char)i); 
		  // break line after every eight characters. 
		  if (i % 8 == 7) {
		  System.out.write('\n'); } else { System.out.write('\t'); } }
		  System.out.write('\n'); 


	}

}