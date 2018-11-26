
public class SynchronizedDemo  {

	 public static void main(String[] args) {
			DisplaySynch d=new DisplaySynch();
			myThread3 t1=new myThread3(d, "Dhoni");
			myThread3 t2=new myThread3(d, "virat");
		      t1.start();
		      t2.start();
	
	}

}
class myThread3 extends Thread
{
  DisplaySynch d;
  String name;
  myThread3 (DisplaySynch d,String name)
  {
	  this.d=d;
	  this.name=name;
  }
	public void run() {
		d.wish(name);
	}
}
class DisplaySynch
{
 
	public synchronized void wish(String name) {
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
