
public class lab527{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JlcService serv= new JlcService();
     byte b1=12;
     byte b2=23;
     serv.show(b1,b2);
     
	
	}

}
class JlcService 
{

void show(byte...ab)
{
System.out.println("show(byte..)");	
}
}

