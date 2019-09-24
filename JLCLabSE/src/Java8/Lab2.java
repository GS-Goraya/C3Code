package Java8;

interface inter1 {
	public void add(int a,int b);
}
public class Lab2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      inter1 i =(a,b)->System.out.println("The Sum of "+(a+b));
      i.add(10,20);
      i.add(20, 40);
	}

}
