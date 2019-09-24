// How to Search an element in array .?
// How to check if array contains a number in java.?
package program99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array3 {

	public static void main(String args[]) throws IOException
	{
		boolean isPresent=false;
		Integer index=null;
		int array[]= {1,2,4,3,6,4};
		System.out.println("Enter the number to be seach ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input =br.readLine();
		Integer number=Integer.valueOf(input);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==number)
			{
				isPresent=true;
				index=i;
				
			}
		}
		if(isPresent==true)
		{
			System.out.print("element present in index"+index);
		}
		else
		{
			System.out.println("element is not present in array");
		}
	}
}
