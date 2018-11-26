import java.util.*;
public class ComparableDemo4 {
	public static void main(String[] args) {
		employee1 e1=new employee1("nag",100);
		employee1 e2=new employee1("balaiah",200);
		employee1 e3=new employee1("chiru",50);
		employee1 e4=new employee1("venki",150);
		employee1 e5=new employee1("nag",100);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t1 =new TreeSet(new MyComparator5());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}
}
class employee1 implements Comparable 
{
	String name ;
	int eid;
	employee1(String name, int eid)
	{
		this.name=name;
		this.eid=eid;			
	}
	public  String toString ()
	{
     	return name+"---"+eid;
	}
public int compareTo(Object obj)
{
  int eid1=this.eid;
  employee1 e=(employee1)obj;
  int eid2=e.eid;
  if(eid1<eid2)
  {
	  return -1; 
  }
  else if(eid1>eid2)
  {
	  return 1;
  }
  else 
  {
	  return 0;
  }
}
}
class MyComparator5 implements  Comparator 
{
	public int compare(Object obj1,Object obj2)
	{
		employee1 e1=(employee1)obj1;
		employee1 e2=(employee1)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
}