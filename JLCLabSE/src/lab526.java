
public class lab526{

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


void show (Byte ab,Byte bc)
{
	System.out.println("show(Byte,Byte)");
}
void show(byte...ab)
{
System.out.println("show(byte..)");	
}
}

