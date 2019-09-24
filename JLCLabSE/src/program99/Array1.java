//Find the Missing number in Array.?

package program99;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {1,2,3,4,6};
       int expEle=a.length+1;
       int totalExpSum=expEle*(expEle+1)/2;
       int sum=0;
       for(int i=0;i<a.length;i++)
       {
    	   sum=sum+a[i];
       }
       
      
       
       System.out.println(totalExpSum-sum+" Missing element");
       
       
	}

	 
}
