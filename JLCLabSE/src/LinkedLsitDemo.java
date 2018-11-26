import java.util.LinkedList;

public class LinkedLsitDemo {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("JLC");
	l.add(30);
	l.add(null);
	l.add("JLC");
	System.out.println(l);
	l.set(0, "soft");  //replacing to content with  new content
	System.out.println(l);
	l.add(0,"vky");
	System.out.println(l);
	l.removeLast();
	System.out.println(l);
	l.addFirst("ada");
	System.out.println(l);
	
	

	}

}
