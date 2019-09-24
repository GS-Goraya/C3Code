package program99;

public class Lab15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="xyzo";
		String b="abc";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" and "+b);
	}

}
