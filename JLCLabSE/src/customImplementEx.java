
public class customImplementEx {

	public static void main(String[] args) {
		System.out.println("*** converting String to Char Array **");
		String str="JLCINDIA";
		//char ch[]=str;
		char ch[]=new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(i+"\t"+ch[i]);
		}
        System.out.println("**** conerting string to byte Array ***");
        byte by[]=new byte [str.length()];
        for(int i=0;i<by.length;i++)
        {
        	char c=str.charAt(i);
        	byte b=(byte )c;
        	by[i]=b;
        	
        	}
	   for(int i=0;i<by.length;i++)
	   {
		   System.out.println(i+"\t"+by[i]);
	   }
	}

}
