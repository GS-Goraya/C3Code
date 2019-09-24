package program99;

import java.util.Scanner;

public class Lab16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year number");
	  int year=sc.nextInt();
	  if((year%400==0)||((year%4==0)&&(year%100!=0)))
		  System.out.println("This is leap years");
	  else
		  System.out.println("This is not leap year");
		  
		  
		
		
	}

}
