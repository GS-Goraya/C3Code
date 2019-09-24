// Find minimum or maximum number in array.?
// Assume one element as a small or large.
// then compare with other element if condition true then swap numbers.


package program99;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int arr[]= {1,56,4,3,0,45};
		 int max=arr[0];		 
         for(int i=1;i<arr.length;i++)
         {
        	
        	  if(max<arr[i])
        	  {
        		  max=arr[i];
        	  }
         }
         System.out.println("Maximum value"+max);
         int min=arr[0];
         for(int i=1;i<arr.length;i++)
         {
        	  if(min>arr[i])
        	  {
        		  min=arr[i];
        	  }
         }
         System.out.print("Minimum Value"+ min);
	}

}
