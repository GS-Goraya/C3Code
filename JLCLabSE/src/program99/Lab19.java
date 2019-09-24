package program99;

import java.util.Scanner;

public class Lab19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=  new Scanner (System.in);
      System.out.println("Enter value of String ");
       String s1= sc.next();
       String s2=sc.next();
       String s3="";
       s3=s1;
       s1=s2;
       s2=s3;
       System.out.println(s1+s2);
//       String s3= "";
//         s3= s1+s2;
//         s2=s3.substring(0, s3.length()-s2.length());
//         s1=s3.substring(s1.length());
//         System.out.println("String S2 length"+s2);
//         System.out.println("String s1 value"+ s1);
      }
     	}
