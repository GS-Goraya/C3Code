import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TreeSet t=new TreeSet(new MyComparator1());
			  t.add("AABC");
			  t.add("LKMA");	 
			  t.add("DCMS");
			  t.add("DDED");	 
			  t.add("POLA");
			  System.out.println(t);
	
	}

}
class MyComparator1 implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
	  String s1=(String)obj1;
	  String s2=(String)obj2;
      return -s1.compareTo(s2);
	  //return s2.compareTo(s1);
	  
  }
}
