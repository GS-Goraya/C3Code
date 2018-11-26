
public class lab537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 hello h=hello.getHello();
 System.out.println(h);
 System.out.println(hello.getHello());
 System.out.println(hello.getHello());
 //h.clone
 
	}

}
class hello
{
  private static hello ins=new hello();
  private hello() {}
  public static hello getHello()
  {
	  return ins;
  }
}
