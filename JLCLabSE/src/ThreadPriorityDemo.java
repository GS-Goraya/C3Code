
public class ThreadPriorityDemo {


	 public static void main(String[] args) {


	mythread2 t =new mythread2();
	t.setPriority(10);
	t.start();
	for(int i=0;i<10;i++)
	{
	 System.out.println("main Thread");
	}
	}}
	
	class mythread2 extends Thread
	{
		  public void run()
		{
		for(int i=0;i<10;i++)
		{
	System.out.println("child thread");
		}
		}}
