
public class SynchronizedBlock  {

	 public static void main(String[] args) {
			DisplaySynch1 d=new DisplaySynch1();
			myThread4 t1=new myThread4(d, "Dhoni");
			myThread4 t2=new myThread4(d, "virat");
		      t1.start();
		      t2.start();
	
	}

}
class myThread4 extends Thread
{
  DisplaySynch1 d;
  String name;
  myThread4 (DisplaySynch1 d2,String name)
  {
	  this.d=d2;
	  this.name=name;
  }
	public void run() {
		d.wish(name);
	}
}
class DisplaySynch1
{
 
	public synchronized void wish(String name) {
		
		System.out.println("Before Synchronized Block");
		synchronized (this) {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Good Morning");
             try
             {
            	 Thread.sleep(2000);
             }
             catch(InterruptedException e)
             {
                        e.printStackTrace();            	 
             }
             System.out.println(name);
		}
		}
  }
  

}
