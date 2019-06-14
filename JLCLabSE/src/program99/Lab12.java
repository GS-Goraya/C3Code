package program99;

import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
      Scanner sc=new Scanner(System.in);
      int even=sc.nextInt();
      for(int i=0;i<=even;i++)
    	  if(i%2==0)
    		  System.out.println("This is even nummber "+i);
	}

}
