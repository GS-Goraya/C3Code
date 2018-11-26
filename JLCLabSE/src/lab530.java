
public class lab530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rt=null;
		//rt =new Runtime();
		 System.out.println(Runtime.getRuntime());
		 System.out.println(Runtime.getRuntime());
	     rt=Runtime.getRuntime();
	     double d=1024*1024;
	  System.out.println("A P :"+rt.availableProcessors());//Returns the number of processors available to the Java virtual machine.
    System.out.println("M M :"+rt.maxMemory()/d);//Returns the maximum amount of memory that the Java virtual machine will
System.out.println("T M :" +rt.totalMemory()/d); //
System.out.println("F M :"+ rt.freeMemory()/d);
	}

}
