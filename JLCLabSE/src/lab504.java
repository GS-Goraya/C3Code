
public class lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StringBuilder  sb=new StringBuilder("JLC");
  System.out.println("C :"+sb.capacity());
  System.out.println("L :"+sb.length());
  sb.trimToSize(); //reduce the capacity to length
  System.out.println("C :"+sb.capacity());
  System.out.println("L "+sb.length());
	}

}
