//Reverse a String ..?  Only Small changes in last Program.

package program99;

public class String3 {

	public static void main(String[] args) {
	
		        String a="abc tech";
		        char ch[]=a.toCharArray();
		         int size= ch.length;
		         char y[]=new char[size];
		         int i=0;
		         while(i!=size)
		         {
		        	 y[size-1-i]=ch[i];
		        	 i++;
		         }
		         System.out.print(ch);
		         System.out.println();
		         System.out.print(y);
	

	}

}
