
public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException  {
        MyThread3 t=new MyThread3();
         t.start();
         t.join();  //If we commment this line then both main and child thread will be exxecuted semienatinously and we can't expect exject output.
                    // if we are not commenting this line then main thread called join method on child thread object hence main will wait until compeleting child thread. 
                   // in this case output is diff.
         for(int i=0;i<10;i++)
         {
        	 
        	 System.out.println("Ramma Thread");
         }
	}

}

class MyThread3 extends Thread
{
   public void run()
   {
	   
	   for(int i=0; i<10;i++)
	   {
		   System.out.println("Seeta Thread ");
		   try
		   {Thread.sleep(2000);
		   }
		   catch(InterruptedException e)
		   {
			   e.printStackTrace();
		   }
	   }
	   
   }

}
