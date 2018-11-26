import java.util.*;
public class TreeMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap t=new TreeMap ();
		t.put(101, "hap");
		t.put(102, "DCS");
		t.put(103, "KLAM");
		t.put(104, 105);
		//t.put("MMMM", "XXXX"); //CCE
		//t.put(null,"XXX");  //NPE
		System.out.println(t);  //{101=hap, 102=DCS, 103=KLAM, 104=105}
		
		
		
		
	}

}
