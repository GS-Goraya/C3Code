
public class ThreadSleepDemo2 {

	public static void main(String[] args) {
		Mythread5 t=new Mythread5();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");

	}

}
class Mythread5 extends Thread 
{
	public void run()
	{
		
		for(int i=0;i<10000;i++)
		{
			System.out.println("I am lazy thread"+i);
	    
	
		}  
		  System.out.println("i want to sleep");
		  try
		  {
			 Thread.sleep(1000); 
			 System.out.println("sleeped");
		  }
		  catch(InterruptedException e)
		  {
			  
			  System.out.println("i got interrupted");
		  }
	
	}
	
}
