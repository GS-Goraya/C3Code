import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class MainClass extends Thread
{
//	static Map< Integer,String> hashMap = new HashMap<>();
//	static Map<Integer,String> hashmp = Collections.synchronizedMap(hashMap);
	static ConcurrentHashMap hashmp=new ConcurrentHashMap();

public void run()
{
  try
  {
	  Thread.sleep(200);
  }
  catch(InterruptedException e)
  { }
  System.out.println("Child thread updating list ");
  hashmp.put(103,"C");
}
public static void main(String[] args) throws InterruptedException {
	 hashmp.put(101,"A"); 
	 hashmp.put(102,"B");
MainClass mc=new MainClass();
mc.start();
Set s1=hashmp.keySet();
Iterator itr = s1.iterator();
while (itr.hasNext()) {
Integer I1 = (Integer) itr.next();
System.out.println("Main Thread Iterating list adn current Entery is "+I1+"..."+hashmp.get(I1));
MainClass.sleep(300);
}
System.out.println(hashmp);
}
}