
public class lab558 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Main started");
  int r=new hello1().show();
  System.out.println("main "+r);
  System.out.println("Main Completed");
 
}

}
class hello1
{
 int show()
 {
	 int a=0;
	 try
	 {
		 System.out.println("try block begin" +a);
	   a=10/4;
	   System.out.println("try block ends" +a);

	   return a;
	 }
	 catch(ArithmeticExsception e)
	 {
		 a=20;
		 System.out.println("catch block "+a);
		 return a;
	 }
	 finally 
	 {
		 System.out.println("finally block "+a);
		 int arr[]=new int[-1];
		 
	 }
	
 }

}
