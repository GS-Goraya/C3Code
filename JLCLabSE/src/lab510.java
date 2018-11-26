
public class lab510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10;
     Integer in=new Integer(123);
     System.out.println(in);
     //Second way///
     int b=456;
     Integer i=Integer.valueOf(b);
     System.out.println("Second way to coversion from primitive to wrapper"+i);
     ///First way //
     byte b1=123;
     Byte bref=new Byte(b1);
     System.out.println(bref);
     char ch='A';
     Character cref=new Character (ch);
     System.out.println(cref);
     
     //// we can also use to Static valueOf () method from coressponding wrapper classes.
     
	  	
	}

}
