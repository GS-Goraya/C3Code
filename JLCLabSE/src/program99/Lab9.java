package program99;

import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)

			if (i % 2 != 0)

				System.out.println("Odd number "+i + "");

	}
}
