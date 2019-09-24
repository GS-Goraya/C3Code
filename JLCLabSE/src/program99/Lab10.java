package program99;

import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int sum=0;
	Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   if(n>=1)
	   {
	   for(int i=0;i<=n;i++)
	   {
		 sum=sum+i;  
		  
	   }
	    System.out.println("sum of first n natural num  "+sum);
	   }
	}

}

