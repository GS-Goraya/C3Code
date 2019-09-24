package program99;

import java.util.Scanner;

public class Lab17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of two number");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int q=0;
		while(a>=b)
		{
			a-=b;
			q++;
		}	
		int rem =a*b;
		rem=rem-a;
		System.out.println(rem);
		System.out.println(q);
	
	}

}
