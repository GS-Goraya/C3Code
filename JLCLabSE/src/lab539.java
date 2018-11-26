
public class lab539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  hello h=hello.getHello();
  System.out.println(h);
  System.out.println(hello.getHello());
  System.out.println(hello.getHello());	
  hello h2=(hello)h.clone();
  System.out.println(h2);
	}

}
class hello
{
private static hello ins=new hello();

private hello()
{
}
public static hello getHello()
{
 return ins;	
}
protected Object clone()
{
  return this;
}
}

