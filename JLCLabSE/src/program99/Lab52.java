package program99;

import java.util.Scanner;
public class Lab52 {
	public static void main(String[] args)  {
	 Scanner sc= new Scanner(System.in);
	 int num=sc.nextInt();
	 int limit=1000;
	 int sum=0;
	 for(int j=1;j<=limit;j++)
	 {
		
		 for(int i=1;i<=j;i++)
      {
    	  if(j%i==0)
    	  sum=sum+i;
      }
      if(sum==j)
      {
    	 System.out.println("This number is perfect "+j);  
      }
     
      }
	}}	
 
