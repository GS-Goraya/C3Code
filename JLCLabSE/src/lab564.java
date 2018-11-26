
public class lab564 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Exception ex1=new ClassNotFoundException();
       Exception ex2=new NullPointerException();
       System.out.println(ex1 instanceof RuntimeException);
       System.out.println(ex2 instanceof RuntimeException);
       
	}

}
