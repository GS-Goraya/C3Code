// Computing length of String in java without using inbuild method length.

package program99;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String x="Abc tech";
       x=x.concat("\0");
       char ch[]= x.toCharArray();
       int i=0;
       int count=0;
       while(ch[i]!='\0')
       {
    	   i++;
    	   count++;
       }
       System.out.println(count);
	}

}
