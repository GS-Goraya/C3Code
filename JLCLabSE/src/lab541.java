
public class lab541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<10;i++)
System.out.println(hello.getHello());

}

}
class hello
{
private static hello ins1=new hello();
private static hello ins2=new hello();

private hello()
{
}
public static hello getHello()
{if(Math.random()>0.5)

 return ins1;	
else 
	return ins2;
}}