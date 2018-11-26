
public class WaitThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ThreadB b=new ThreadB();
     b.start();
     Thread.sleep(10000);
     synchronized(b)
     {
        System.out.println("main Thread trying to call wait() method");
        b.wait(10000);   /// Here this wait method with time is solving to above example problem
        System.out.println("main thread got notification");
        System.out.println(b.total);
    	 
     }     
	}

}
class ThreadB extends Thread
{
	 int total=0;
   	public void run() {
	  
   		synchronized (this) {
			
   		System.out.println("Child thread start calculation");
   		for(int i=0;i<=100;i++)
   		{
   			total=total+i;
   			
   		}
   		
   		System.out.println("child thread try to giving notification");
   		 this.notify();  
   		
   		
   		}
   		
   		
   		
	}
}	

