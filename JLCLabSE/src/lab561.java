
public class lab561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("stmt 0");
        try
        {
        	System.out.println("stmt 1");
        	try
        	{
        		System.out.println("stmt2");
        		
        	}
        	catch(Exception e)
        	{
        		System.out.println("stmt3");
        	
        	}
        	finally
        	{
        		System.out.println("stmt 4");
        	}
        	System.out.println("stmt 5");
        }
        catch(Exception e)
        {
        	System.out.println("stmt 6");
        	try
        	{
        		System.out.println("stmt 7");
        		
        	}
        	catch(Exception e1) 
        	{
        		System.out.println("stmt 8");
        		
        	}finally
        	{
        		System.out.println("stmt9");
        		
        	}
        	System.out.println("stmt 10");
        }
        finally
        {
        	System.out.println("stmt 11");
          try
          {
        	  System.out.println("stmt 12");
          }
          catch (Exception e)
          {
        	  
        	  System.out.println("stmt 13");
          }
          finally
          {
        	  System.out.println("stmt 14");
          }
          System.out.println("stmt 15");
        
        }
        System.out.println("stmt 16");
	}

}
