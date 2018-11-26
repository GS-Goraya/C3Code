
public class lab508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a =123;
//   String st1=a;  //invalid 
 // String s2=(String )a; // typecaste not poossible with String Invalid  
  String s3=""+a;
  String s4=a+"";
  System.out.println(s3);
  System.out.println(s4);
  String s5=String.valueOf(a);
  System.out.println(s5);
  String s6=Integer.toString(a);
  System.out.println(s6);
  
	}

}
