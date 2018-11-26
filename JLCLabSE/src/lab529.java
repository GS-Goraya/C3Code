import java.util.Enumeration;
import java.util.Properties;

public class lab529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("\n ***  Accesing All Properties");
    Properties p=System.getProperties();
    Enumeration enm=p.propertyNames();
    while(enm.hasMoreElements())
    {
    	String pName=enm.nextElement().toString();
    	String val=System.getProperty(pName);
    	System.out.println(pName+"\t:\t"+val);
    }
    
	}

}
