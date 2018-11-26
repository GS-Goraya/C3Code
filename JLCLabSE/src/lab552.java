
public class lab552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Main started");
         String data=null;
         try
         {
        	 data= args[0];
        	 
        	 
        	 
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
        	 System.out.println("provide one value as a CLA");
         }
         int x=0;
         try
         {
        	 x=Integer.parseInt(data);
        	 
         }
         catch(NumberFormatException e)
         {
        	 System.out.println("provide  int value as a CLA");
         }
         try
         {
        	 
        	 int res=10/x;
        	 System.out.println("result "+ res);
         }
         catch(ArithmeticException e)
         {
        	 
        	 
        	 System.out.println("provide non zero int value as CLA");
         }
         System.out.println("Main Completed ");
	}

}
