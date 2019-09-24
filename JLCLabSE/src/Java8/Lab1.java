package Java8;

interface inter
{
 public void m1();	
}
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     inter i=()->System.out.println("This Lamda Expersion calling");
     i.m1();
	}

}
