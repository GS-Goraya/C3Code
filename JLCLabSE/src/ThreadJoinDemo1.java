
public class ThreadJoinDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread4.mt= Thread.currentThread();
      MyThread4 t=new MyThread4();
       t.start();
     //  t.join();
       for(int i=0; i<10;i++)
 	  {
 		  System.out.println("Main thread");
 		  Thread.sleep(2000);
 		  
 	  }
	}

}
class MyThread4 extends Thread
{
	static Thread mt;
  public void run()
  {
	  try {
		mt.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  for(int i=0; i<10;i++)
	  {
		  System.out.println("child thread");
		  
	  }
	  
  }

}
