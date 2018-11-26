
public class lab445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 System.out.println("\n with employee");
		 employee em1=new employee(99,31903290);
		 employee em2=new employee(99,31903290);
		 employee em3=new employee(88,65799999);
		 employee em4=em1;
		 System.out.println(em1.hashCode());
		 System.out.println(em2.hashCode());
		 System.out.println(em3.hashCode());
		 System.out.println(em4.hashCode());
		 
		 System.out.println(em1==em2);
		 System.out.println(em1==em3);
		 System.out.println(em1==em4);
		 System.out.println(em1==em4);
		 
		 
	}

}

class employee
{
 int eid;
 long phone;
 employee(int eid,long phone)
 {
	 this.eid=eid;
	 this.phone=phone;
	 
 }
 public int hashCode()
 {
	 return (int )(phone|eid);
 }
}
