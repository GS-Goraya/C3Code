// Coping one String into another String in java.

package program99;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="abc tech";
        char ch[]=a.toCharArray();
         int size= ch.length;
         char y[]=new char[size];
         int i=0;
         while(i!=size)
         {
        	 y[i]=ch[i];
        	 i++;
         }
         System.out.print(ch);
         System.out.println();
         System.out.print(y);
	}

}
