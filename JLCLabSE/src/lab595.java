import java.util.*;

public class lab595 {

	public static void main(String[] args) {
		Vector v=new Vector ();
		v.addElement("sRI");
		v.addElement("VAS");
		v.addElement("DAnde");
		System.out.println(v);
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			Object obj=(Object)en.nextElement();
			System.out.println(obj);
		}
		
		
	}
}
