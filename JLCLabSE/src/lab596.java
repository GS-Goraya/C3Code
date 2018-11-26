import java.util.Enumeration;
import java.util.Properties;

public class lab596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Properties p=new Properties();
     p.put("JLC-99", "sri");
     p.put("JLC-90", "vas");
     p.put("JLC-77","dsnde");
     System.out.println(p);
     Enumeration en=p.propertyNames();
     while (en.hasMoreElements())
     {
    	String pnm=(String) en.nextElement();
    	String val=p.getProperty(pnm);
    	System.out.println(pnm+"\t"+val);
     }
     
     
		
}

}
