package program99;

import java.util.Scanner;

public class Lab1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a and b value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Before swap \na="+a +"\nb="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swap \na ="+a+"\nb="+b);
	
}
}
