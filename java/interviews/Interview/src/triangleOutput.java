
public class triangleOutput {

	public static void main(String[] args) {
		int[] in = {4,7,3,6,7};
		tianagleoutput(in);
		
		System.out.print("{{");	
		for(int i =0 ;i < in.length; i++)
		{
			if(i == in.length -1)
				System.out.print(in[i]);
			else
				System.out.print(in[i]+ ",");		
		}
		System.out.println("}}");
	}

	static void tianagleoutput(int [] in)
	{
		if(in.length == 1){
			return;
		}
		
		
		int[] newin = new int[in.length-1];
		
		for(int i =0; i<in.length-1; i++)
		{
			newin[i] = in[i] +in[i+1];
		}
		
		tianagleoutput(newin);
		
		System.out.print("{{");	
		for(int i =0 ;i < newin.length; i++)
		{
			if(i == newin.length -1)
				System.out.print(newin[i]);
			else
				System.out.print(newin[i]+ ",");		
		}
		System.out.println("}}");	
	}
}
