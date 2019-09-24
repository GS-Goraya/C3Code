//Find unique element in array which is not  repeated.?
package program99;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] ={1,2,3,4,2,3,4,};
   int res=arr[0];
      for(int i=1;i<arr.length;i++)
      {
    	  res= res^arr[i];
      }
      System.out.println("Single element" +res);
	}

}
