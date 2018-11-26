 import java.util.*;
public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap h=new HashMap();
       h.put("DBC",123);
       h.put("BCD", 1234);
       h.put("KAP",320);
       h.put("AMM",567);
       System.out.println(h);
       System.out.println(h.put("AMM",000));
       Set s=h.keySet();
       System.out.println(s);
       Collection c=h.values();
       System.out.println(c);
       Set s1=h.entrySet();
       System.out.println(s1);
       Iterator itr=s1.iterator();
       while(itr.hasNext())
       {
    	   Map.Entry m1=(Map.Entry)itr.next();
    	   System.out.println(m1.getKey()+"............"+m1.getValue());
    	   if(m1.getKey().equals("KAP"))
    	   {
    		   
    		   m1.setValue("MMM");
    	   }
    	   
    	   
       }
       System.out.println(h);
    	   
       
       
       
	}

}
