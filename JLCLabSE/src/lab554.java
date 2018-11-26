
public class lab554 {

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
    System.out.println("Main compeleted");
	}

}
