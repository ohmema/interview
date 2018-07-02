
public class Demo {

	public static void main(String[] args) {
//		int[] scores = {-1,-2,-3,-4};
//		int[] scores = {11,12,14,-4,-3};
//			System.out.print(func(scores));
		System.out.print(func2("ascadss"));
	}

	  static int func1(int[] scores) {
		  
		  int[] ls = new int[scores.length];
		  ls[0] = 1;
		  
		  for(int i =1 ; i < scores.length;i ++)
		  {
			  int max = 0;
			  int maxIndex = i-1;
			  for(int j = i-1 ; j >= 0 ; j--)
			  {
				  if(max < ls[j] && scores[j] < scores[i])
				  {
					  max = ls[j];
					  maxIndex = j;
				  }
			  }
			  ls[i] = max + 1;
		  }
			  
			  
		int max = ls[0];
		for(int i = 1; i < ls.length; i++)
		{
			max = (max > ls[i])? max: ls[i];
		}
		
		return max;
	  }
	  
	  
	  
	  
	  static char func2(String theString) {
          if(theString ==  null)
              return (char) 0;
           if(theString.length() ==  0)
              return (char) 0;
              
	        int[] array = new int[126];
	        for(int i =0; i< theString.length() ; i++)
	        {
	            array[theString.charAt(i)]++;
	        }
	        
	        int max = array[0], maxIndex =0;
	        for(int i =1; i<array.length; i++)
	        {
	            if(max < array[i])
	            {
	                max = array[i];
	                maxIndex = i;
	            }
	        }
	        
	        return (char)maxIndex ;
}
}
