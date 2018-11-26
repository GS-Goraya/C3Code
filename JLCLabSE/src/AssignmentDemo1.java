import java.util.*;
public class AssignmentDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      employee10 e1=new employee10("amit",101,65987456,20, "Blr");
      employee10 e2=new employee10("harry",102,5600056,21, "jk");
      employee10 e3=new employee10("amit",103,65987456,20, "Blr");
      employee10 e4=new employee10("garry",104,1234566,22, "MP");
      employee10 e5=new employee10("mohit",105,3335656,15, "Delhi");
      ArrayList l=new ArrayList();
      l.add(e1);
      l.add(e2);
      l.add(e3);
      l.add(e4);
      l.add(e5);
      
	}

}
class employee10
{
	  String ename;
	  int eid;
	  long phone;
	  int age;
	  String city;
	  employee10(String ename,int eid,long phone,int age,String city)
	  {
		  this.ename=ename;
		  this.eid=eid;
		  this.phone=phone;
		  this.age=age;
		  this.city=city;
	  }
}
