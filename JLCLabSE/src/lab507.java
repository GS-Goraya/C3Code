
public class lab507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuilder sb1=new StringBuilder("A");
   StringBuilder sb2=new StringBuilder("A");
   System.out.println(sb1.equals(sb2)); // equals method not override in StringBuilder
   String str1=sb1.toString();
   String str2=sb2.toString();
   System.out.println(str1.equals(str2));
 
	}

}
