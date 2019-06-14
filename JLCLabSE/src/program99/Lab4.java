package program99;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number for division ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int quotient=0;
    while(a>=b)
    {
    	a=a-b;
    	quotient++;
    	
    }
    System.out.println("quotient is"+ quotient);
    
	}

}
