
public class labClone1 {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
     hell h=new hell(10,25);
     h.show();
     h.x=99;
     h.y=77;
     h.show();
     hell h2=new hell(20,30);
     h2.show();
     h2.x=9990;
     h2.y=53653;
     h2.show();
     h.show();
	}
}
class hell 
{
	int x;
	 int y;
	 hell(int x,int y)
	 {
		this.x=x;
		this.y=y;
	 }
	 
  
   void show()
   {
	    System.out.println(x+"\t"+y);
	   
   }
   /* public Object clone() throws CloneNotSupportedException
    {
		return super.clone();
    	
    	
    }*/
	 
}