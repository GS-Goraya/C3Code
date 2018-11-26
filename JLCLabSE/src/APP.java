class APP{
public static void main(String args[])
{
  String st="hello";
  String rev="";
  int n=st.length();
 for( int i= n-1;i>=0;i--)
 {
	rev=rev+st.charAt(i);
 }
System.out.println(rev);

}}