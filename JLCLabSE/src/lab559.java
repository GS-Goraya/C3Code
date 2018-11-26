
public class lab559 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("main Started");
       new hello2().show("3");
       System.out.println("main completed");
       
	}

}
class hello2 
{
void show(String str)
{
System.out.println("show called");
try
{
System.out.println("try block strated");
int a=Integer.parseInt(str);
int b=10/a;
System.out.println("try block compeleted"+b);
System.exit(0);



}
catch(ArithmeticException e)
{
	System.out.println("catch block ");
	
	}
finally
{
System.out.println("finally block ");	
}

}

}
