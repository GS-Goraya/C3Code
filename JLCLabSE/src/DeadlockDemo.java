class A1
{
 public  synchronized void d1(B1 b)
 {
	 System.out.println("Thread t1 start execution of d1() method");
	 try
	 {Thread.sleep(6000);
	 }
	 catch(InterruptedException e)
	 {}
	 System.out.println("Thread t1  trying to call Last() method");
	 b.last(); 
	 
 }
  public synchronized void last()
  {
	  System.out.println("Inside A1, this is  last() Method ");
	  
  }
}
class B1
{
	 public synchronized void d2(A1 a)
	 {
		 System.out.println("Thread t2 start execution of d2() method");
		 try
		 {Thread.sleep(6000);
		 }
		 catch(InterruptedException e)
		 {
	
		 }
		 System.out.println("Thread t2  trying to call Last() method");
		 a.last(); 
	 }
	  public synchronized void last()
	  {
		  System.out.println("Inside B1, this is  last() Method ");
		  
	  }	
}
public class DeadlockDemo extends Thread {

	A1 a=new A1();
	B1 b=new B1();
	
	public void m1()
	{
		this.start();
		a.d1(b);
		
	}
	public void run()
	{
		b.d2(a);
	}
	public static void main(String args[]) 
	{
	 DeadlockDemo d=new DeadlockDemo();
	 d.m1();
		
		
	}
}
