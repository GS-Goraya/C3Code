
public class lab562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("main started");
    try
    {
    	new hello3().show();
    	
    }
    catch(Exception e)
    {
    	System.out.println("\n catch block");
    	System.out.println("Ex"+e);
    	System.out.println("Message"+e.getMessage());
    	System.out.println("cause"+e.getCause());
    	System.out.println();
        e.printStackTrace();
         
    }
    System.out.println("main compeleted");
    
	
	
	}

}
class hello3
{
 void show()
 {
	 System.out.println("show () begins");
	 new A().m1();
	 System.out.println("show ends ");
 }
}
class A
{
 void m1()
 {
	 System.out.println("A ..> m1() begins");
	 new B().m2();
	 System.out.println("A ...> m1() ends");
 }
}
class B
{
    void m2()
    {
    	System.out.println("B....> m2() begins");
    	new C().m3();
    	System.out.println("B.....>m2() ends");
    	
    }

}
class C
{
    void m3()
    {
    	System.out.println("C ...> m3 () begins"); 
    	int x=10/0;
    	System.out.println("C ...> m3() ends ");
    }
}