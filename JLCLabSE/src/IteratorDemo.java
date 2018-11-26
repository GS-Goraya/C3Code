import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
	  Vector v= new Vector();
	  for(int i=0;i<10;i++)
	  {
		  
		  v.addElement(i);
	  }
	   System.out.println(v);
        Iterator it=v.iterator();
	  while(it.hasNext())
	  {
		  
		 Integer o= (Integer)it.next();
		 if(o%2==0) {
		 System.out.println(o);
	  }
		 else
		 {
			it.remove();
		 }
	  
	  }
	  System.out.println(v);
		}

	}
