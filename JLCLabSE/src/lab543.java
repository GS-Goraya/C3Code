
public class lab543 {

	public static void main(String[] args) {
		student st=new student (99,"Srinivas",65799999);
		System.out.println(st);
	}

}
final class student 
{
 private final int sid;
 private final String name;
 private final long phone;
 public student(int sid,String name,long phone)
 {
	 this.sid=sid;
	 this.name=name;
	 this.phone=phone;
 }
 public int getSid() 
 {
	 return sid;
	 
 }
 public String  getName()
 {
	 return name;
 }
 public long getPhone()
 {
	 return phone;
	 
 }
 public String toString()
 {
	 return "sid :"+sid+",NAME :"+name+",phone :"+phone;
 }

}
