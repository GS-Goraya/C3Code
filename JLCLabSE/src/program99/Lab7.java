package program99;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
       int year =sc.nextInt();
       if((year%400==0)||(year%4==0)&&(year%100!=0))
       {
    	   System.out.println( year+"Is a leap Year");
       }
       else 
       {
    	   System.out.println("Not a Leap year");
       }
	}

}
