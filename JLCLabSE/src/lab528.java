import java.util.*;

public class lab528 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  long time=System.currentTimeMillis();
  Date dt=new Date(time);
  System.out.println(dt);
    String pnm=System.getProperty("os.name");
    System.out.println(pnm);
      System.setProperty("os.name", "Linux");
      String phm1=System.getProperty("os.name");
      System.out.println(phm1);
      System.setProperty("jlc.website", "www.jlcindia.com");
      System.out.println(System.getProperty("jlc.website"));
	}

}
