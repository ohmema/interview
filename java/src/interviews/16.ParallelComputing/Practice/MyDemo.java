package Practice;

public class MyDemo {
	public static class Thread1 extends Thread {
		public Thread1(String s)
		{
			super(s);
//			this.setName(s);
		}
		public void run() {
			int i = 0; 
			while(i < 20)
			{
				if(i == 0)
					Thread.yield();
				System.out.println(this.getName() + " - " + i++);
//				try {
//			
//					sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					break;
//				}
//				
			}
	
		}
	}

	public  class Thread2 extends Thread {
		void Thread2(String s)
		{
			this.setName(s);
		}
		public void run() {
			int i = 0; 
			while(i < 10000)
			{
				System.out.println(this.getName() + " - " + i++);
				try {
					sleep(100);
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyDemo d = new MyDemo();
		MyDemo.Thread2 t2  = d.new Thread2();
		
		
		for(int i =0; i <  10 ; i++)
		{
			(new Thread1(String.valueOf(i))).start();
//			if(i%5 == 0)
//				Thread.yield();
			//				try {
//					Thread.sleep(10000);
//					
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		}
		
	}

}
