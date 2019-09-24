package program99;

import java.util.ArrayList;

public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,3,4,5,6,7,8,9,10};
      int sum=0,sum2=0;
      
      ArrayList<Integer> al1=new ArrayList(); 
      ArrayList<Integer> al2=new ArrayList();
      for(int i=0; i<a.length;i++)
      {
    	  if(a[i]%2==0)
    	  {
    		  al1.add(a[i]);
    	  }
    	  else
    	  {
    		  al2.add(a[i]);
    	  }
      }	 
      for( int ev:al1)
      {
    	  System.out.print(ev); 
        
          sum=sum+ev;
          
    	  
      }
      System.out.print("  Sum is ="+sum);
      System.out.print("  size="+al1.size());
    
      System.out.println();
      for(int od: al2)
      {
    	  System.out.print(od +"");
         sum2=sum2+od;
      }
      System.out.print("  size="+al2.size());
      System.out.print("  Sum is ="+sum2);
	}

}
