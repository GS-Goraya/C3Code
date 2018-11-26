
public class lab506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="A";
  StringBuilder sb=new StringBuilder("A");
  System.out.println(str.hashCode());
  System.out.println(sb.hashCode());  // In StringBuilder hashCode() is not Overridden
	}

}
