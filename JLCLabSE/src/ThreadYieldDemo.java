
public class ThreadYieldDemo {
	 public static void main(String[] args) {
	
	myThread t=new myThread();
	t.start();
	for(int i=0;i<10;i++)
	{
	System.out.println("main thread");
	}
	}
}
class myThread extends Thread 
{
public void run()
{
  for(int i=0; i<10;i++)
{
   System.out.println("child thread ");
 Thread.yield();
}
}}
