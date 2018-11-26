import java.util.*;
public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap t=new TreeMap(new MyComparator6());
      t.put("XXX", 10);
      t.put("ZZZ", 20);
      t.put("PPP", 30);
      t.put("LLL", 40);
      System.out.println(t); 
	}
}
class MyComparator6 implements Comparator 
{
	public int compare(Object obj1,Object obj2)
	{
		
		String st1=obj1.toString();
		String st2=obj2.toString();
		return st2.compareTo(st1);
		
	}
}
