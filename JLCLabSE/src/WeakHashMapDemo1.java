import java.util.*;
public class WeakHashMapDemo1 {
public static void main(String[] args) throws InterruptedException {
	WeakHashMap h= new WeakHashMap ();
	 Temp t=new Temp();
	 h.put(t,"preet");
	 System.out.println(h);
	 t=null;
	 System.gc();
	 Thread.sleep(1000);
	 System.out.println(h);
}
}
class Temp
{	
public String toString() 
{
	return "Temp";
}
public void finalize()
{
  System.out.println("Finalize method called");	
}
}
