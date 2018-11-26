import java.util.*;


public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			Object o=(Object)ltr.next();
			System.out.println(o);
			if(o.equals("A"))
			{
			  ltr.remove();
			}
			else if(o.equals("B"))
			{
				ltr.add("Z");
			}
			else if(o.equals("C"))
			{
				ltr.set("Y");
			}
			
		}
		System.out.println(l);
		
		
		
		

	}

}
