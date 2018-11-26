
public class lab547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started ");
		  try
		  {

				 String data=args[0];
				 int x =Integer.parseInt(data);
				  int res=10/x;
				  System.out.println("result "+res);
		  }
		  catch (Exception e)
		  {
			  System.out.println("provide correct values");
			  
		  }
		  catch(ArrayIndexOutOfBoundsException e )
		  {
			  System.out.println("provide one value as CLA");
		  }
		  catch(NumberFormatException e)
		  {
			  System.out.println("provide iint value as CLA");
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Provide non zero int values as CLA");
		  }
		  System.out.println("Main completed");
			}
		       
	}


