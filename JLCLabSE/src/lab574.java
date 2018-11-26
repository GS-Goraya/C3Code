public class lab574 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Mythread1 t1=new Mythread1();
   Mythread1 t2=new Mythread1();
   // t1.setName("preet");
   //System.out.println(t1.getName());
   System.out.println(t2.getName());
   t1.start();
   t2.start();
   Thread t= Thread.currentThread();
   for(int i=100;i<=110;i++)
   {
	   System.out.println(t.getName()+" value is  "+i);
	    try
	    {
	    	
	    	Thread.sleep(500);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    } 
   }
	}

}
class Mythread1 extends Thread
{
   public void run()
   {
	   Thread th=Thread.currentThread();
	   for(int i=1;i<10;i++)
	   {
		   System.out.println(th.getName()+" value is "+i);
	    try
	    {
	    	
	    	Thread.sleep(500);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	   }
	   
   }

}
