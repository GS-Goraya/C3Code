
public class lab560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Started");
	       new hello2().show("0");
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




	}
	catch(ArithmeticException e)
	{
		System.out.println("catch block ");
		System.exit(0);
		}
	finally
	{
	System.out.println("finally block ");	
	}

	}
	}

