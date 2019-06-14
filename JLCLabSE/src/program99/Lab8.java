package program99;

import java.io.IOException;

public class Lab8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       char ch=(char) System.in.read();
       if(ch>=65&&ch<=90)
       {
    	   System.out.println("upper case character "+ch);
       }
       if(ch>=97&&ch<=122)
       {
    	   System.out.println("Lower case character "+ch);
       }
       if(ch>=48&&ch<=57)
       {
    	   System.out.println("DIGIT case character "+ch);
       }
       else
       {
    	   System.out.println("special character "+ch);
       }
	}

}
