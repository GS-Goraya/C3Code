
public class lab553 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main started");
      try
      {
    	 String data=args[0];
    	 int x=Integer.parseInt(data);
    	 int res =10/x;
    	 System.out.println("result"+res);
      }
      catch(ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException e)
      {
    	  if( e instanceof ArrayIndexOutOfBoundsException)
    	  {
    		  System.out.println("provide I/P value as CLA"); 
    	  }
    	  else if(e instanceof NumberFormatException )
    	  {
    		  System.out.println("Provide numerical values as CLA");
    	  }
    	  else
    	  {
    		  System.out.println("provide non zero values as cla");
    	  }
    
      }
      System.out.println("Main Completed");
	}

}
