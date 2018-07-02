
public class Threadclass extends Thread{

		int length;
		int[] array;
		int total;
		Threadclass()
		{
			this(100000);
		}
		
		Threadclass(int len)
		{
			if(len<0)
				len=10;
			else{
				total=0;
				length = len;
				array= new int[len];
			
				for(int i =0 ;i < length;i++)
					array[i]=i;
			}
			
		}
		
		/*
		public void run()
		{
			for(int i=0;i<length;i++)
				System.out.printf("%d:%s--> %d \n", this.getId(), this.getName(),array[i]);
			
		}
		*/
		public void run ()
		{
			for(int i=0;i<10000;i++){
				total++;
				System.out.printf("%s: total: %d\n", this.getName(),total);
			}
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=5;i<10;i++)
		{
			Threadclass thr = new Threadclass(i);
			thr.start();
		}
		 */
		
		for(int i=0;i<10000;i++)
		{
			Threadclass thr=new Threadclass();
			thr.start();
		}
	}

}
