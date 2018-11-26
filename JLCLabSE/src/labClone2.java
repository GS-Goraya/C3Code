
public class labClone2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       hai h=new hai();
         h.show();
         hai h2=new hai();
         h2=h;
         h2.show();
         h2.x=9889;
         h2.y=62762;
         h.show();
         h2.show();
   
	}

}
class hai
{
 int x=10;
 int y=20;
 void show()
 {
	 System.out.println(x);
	 System.out.println(y);
 }
 
}
