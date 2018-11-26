
public class lab555 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Main Started ");
		    try
		    {
		     int res=10/0;
		     System.out.println("result "+res);
		     
		    }
		    catch(NumberFormatException e)
		    {
		    	System.out.println("Invaild Input");
		    }  
    finally
	{
		System.out.println("Finally block ");
	    System.out.println("Main compeleted");
	}

	}}
