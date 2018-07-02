// DeadlockDemo.java
class DeadlockDemo
{
   public static void main (String [] args)
   {
      FinTrans ft = new FinTrans ();
      DTransThread tt1 = new DTransThread (ft, "Deposit Thread");
      DTransThread tt2 = new DTransThread (ft, "Withdrawal Thread");
      tt1.start ();
      tt2.start ();
   }
}

class DTransThread extends Thread
{
   private FinTrans ft;
   private static String anotherSharedLock = "";
   DTransThread (FinTrans ft, String name)
   {
      super (name); // Save thread's name
      this.ft = ft; // Save reference to financial transaction object
   }
   public void run ()
   {
      for (int i = 0; i < 100; i++)
      {
           if (getName ().equals ("Deposit Thread"))
           {
               synchronized (ft)
               {
                  synchronized (anotherSharedLock)
                  {
                     ft.transName = "Deposit";
                     try
                     {
                        Thread.sleep ((int) (Math.random () * 100));
                     }
                     catch (InterruptedException e)
                     {
                     }
                     ft.amount = 2000.0;
                     System.out.println (ft.transName + " " + ft.amount);
                  }
               }
           }
           else
           {
               synchronized (anotherSharedLock)
               {
                  synchronized (ft)
                  {
                     ft.transName = "Withdrawal";
                     try
                     {
                        Thread.sleep ((int) (Math.random () * 100));
                     }
                     catch (InterruptedException e)
                     {
                     }
                     ft.amount = 250.0;
                     System.out.println (ft.transName + " " + ft.amount);
                  }
               }
           }
      }
   }
}