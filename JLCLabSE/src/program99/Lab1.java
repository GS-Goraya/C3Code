package program99;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		int a[]= {14,12,56,52,88};
		int b[]= {140,120,560,520,100};
		 for(int i=0;i<=b.length;i++)
		 {
			 a[i]= a[i]+b[i];
			 b[i]=a[i]-b[i];
			 a[i]=a[i]-b[i]; 
		 }
		 for(int s:a)
		 {
			 System.out.print(s);
			 
		 }
		 for(int d:b)
		 {
			 System.out.print(d);
			 
		 }
	
	}

}
