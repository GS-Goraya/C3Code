// find the kth smallest or largest  element in unsorted array
// Same as find minimum or maximum number in array bs liitle diff for kth.
package program99;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int []a= {5,8,12,7,6,2,4,10,21,33};
   int k=4;
   for(int i=0;i<a.length;i++)
   {
	   for(int j=i+1;j<a.length;j++)
	   {
		   if(a[i]>a[j])   // change here logic for largest kth element
		   {
			   int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		   }
		   
	   }
	   if(i==k-1)
	   {
		   System.out.println(k+"smallest element is"+a[i]);
	       break;
	   }
	  
	   }
   System.out.println("--------------------------");
   for(int ii=0;ii<a.length;ii++)
   {
	   System.out.print(a[ii]+" ");
   }
   }
}