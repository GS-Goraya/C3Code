
public class labClone4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class hai
{
	int x;
	hai(int x)
	{
		this.x=x;
	}
}
class hello implements Cloneable
{
 int y;
 hai hai;
 hello(int y, hai hai)
 {
	 this.y=y;
	 this.hai=hai;
 }
 void show()
 {
	 
	 System.out.println("hello ..>"+y);
	 System.out.println("hai...>"+ hai.x);
	 
 }
 public Object clone() 
}
