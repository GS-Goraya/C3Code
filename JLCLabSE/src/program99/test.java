package program99;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter two number");
		Scanner sc=new Scanner (System.in);
		 String a=sc.next();
		 String b=sc.next();
		  a=a+b;
		  b=a.substring(0,a.length()-b.length());
		  a=a.substring(b.length(),a.length());
		  System.out.println(a);
		  System.out.println(b);

}}
