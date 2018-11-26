package program99;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be added");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int carry;
		while(b!=0)
		{
			carry=a&b;
			a=a^b;
			b=carry<<1;
		}
	}

}
