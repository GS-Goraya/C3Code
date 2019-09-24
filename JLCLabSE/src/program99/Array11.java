// Find Second largest or Second Smallest number in array.?
// create one for loop for all element.
// create second loop for comapre element and for swap largest element.
// then used break to break a loop only for two element it will not compare to all element .
// for more effiecency of program.

package program99;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {10,40,60,80,70,30,100,120,130};
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=i+1;j<a.length;j++)
    	  {
    		  if(a[i]<a[j])
    		  {
    			  int temp=a[i];
    			  a[i]=a[j];
    			  a[j]=temp;
    		  }
    	  }	
    	  if(i==1)
    	  {
    		  break;
    	  }
      }
      for(int i=0;i<a.length;i++)
      {
    	  System.out.print(a[i]+"   ");
      }
      System.out.println(a[1]);
      
      
	
	}

}
