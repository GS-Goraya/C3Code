import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet t=new TreeSet(new MyComparator2());
		  t.add(new StringBuffer("AABC"));
		  t.add(new StringBuffer("LKMA"));	 
		  t.add(new StringBuffer("DCMS"));
		  t.add(new StringBuffer("DDED"));	 
		  t.add(new StringBuffer("POLA"));
		  System.out.println(t);

}

}
class MyComparator2 implements Comparator
{
public int compare(Object obj1,Object obj2)
{
 String s1=obj1.toString();
 String s2=obj2.toString();
 return s1.compareTo(s2);
 //return s2.compareTo(s1);
 
}
}