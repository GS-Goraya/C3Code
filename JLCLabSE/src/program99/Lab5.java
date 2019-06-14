package program99;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number for division ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int rem=a-(a/b)*b;
    System.out.println("rem is"+ rem);
    
	}

}

