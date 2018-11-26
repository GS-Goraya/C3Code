
public class lab573 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("main started");
     Thread th= Thread.currentThread();
      ThreadGroup tg=th.getThreadGroup();
      System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
     for(int i=0;i<args.length;i++)
     {	 String st=args[i];
     System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName()+"\t"+st);
     
     }
     
     mythread t=new mythread();
     t.start();
     Thread th1=Thread.currentThread();
     ThreadGroup tg2=th1.getThreadGroup();
     System.out.println(th1.getId()+"\t"+th1.getName()+"\t"+tg2.getName());
     System.out.println("main Thread compelted");
    
	}
	

}
  class mythread extends Thread
  {
	  public void run()
	  {
		  
		  for(int a=0;a<5;a++)
		  {
			  System.out.println("custom thread ");
		  }
		  Thread th1=Thread.currentThread();
		     ThreadGroup tg2=th1.getThreadGroup();
		     System.out.println(th1.getId()+"\t"+th1.getName()+"\t"+tg2.getName());
		     System.out.println("custom Thread compelted"); 
		  
	  }
  }
