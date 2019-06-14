public class Interview {

	public static void main(String args[])
	{
		System.out.println("main started");
      stud s1=new stud(101,"appp", 55,"aaa");
      stud s2=new stud(101,"appp", 55,"bbbb");
      stud s3=new stud(101,"appp", 55,"ccc");
      s1.show();
      s2.show();
      s3.show();
	}
}

class stud
{
 int sid;
 String name;
 int age;
 static String colname;
 stud(int s,String nm,int a,String cn)
 {
	 System.out.println("student 3 args const");
	  sid=s;
	  name=nm;
	  age= a;
	  colname=cn;
	 
	 
 }
 void show()
 {
	System.out.println("name of student"+name); 
	System.out.println("name of student"+sid);
	System.out.println("name of student"+age);
	System.out.println("name of student"+colname);
	 
	 
 }

}
