//How to find the smallest and largest number in array java.?

package program99;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {-10,99,-88,24,50,98754};
		int largest =num[0];
		int smallest=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
				
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println("Given number is :"+ Arrays.toString(num));
		System.out.println("Largest Number is"+ largest);
		System.out.println("smallest Number is"+ smallest);
	}

}
