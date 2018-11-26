class Display
{
  public synchronized void display1()
  {
    for(int i=0;i<10;i++)
    {
    	System.out.println(i);
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	  
  }
  public  synchronized void display2()
  {
	  
	  for(int i=65;i<75;i++)
	  {
		  System.out.println((char)i);
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
}
class MyThread1 extends Thread
{
	Display d;
	MyThread1(Display d)
	{
		this.d=d;
		
	}
		public void run() {
		 
		 d.display1();
		}
	}
class MyThread2 extends Thread
{
	Display d;
	MyThread2(Display d)
	{
		this.d=d;
		
	}
		public void run() {
		 
		 d.display2();
		}
	}


public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display d= new Display();
		 MyThread1 t1=new MyThread1(d);
		 MyThread2 t2=new MyThread2(d);
        t1.start();
        t2.start();
	}

}
