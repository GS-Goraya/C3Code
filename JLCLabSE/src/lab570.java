
public class lab570 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("main starts");
  try
  {
	   StudentService serv=new StudentService();
	   serv.equals(null);
	  
  }
  catch(Exception e)
  {
	  e.printStackTrace();
  }
  System.out.println("main () ends");
	}
}

class StudentService 
{
	String getNameBySid(String sid) throws StudentNotFoundException
	{
		if(sid==null ||sid.isEmpty()||! sid.equals("JLC-099"))
			 throw new StudentNotFoundException(sid);
		else
			return "Srinivas";
	}
}
class StudentNotFoundException extends Exception 
{
  StudentNotFoundException(String sid)
  {
	  super(sid);
  }
}
