
public class labClone3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
       haiClone hai=new haiClone(10);
       helloClone h1=new helloClone(20,hai);
       helloClone h2=(helloClone)h1.clone();
       h1.show();
       h2.show();
       System.out.println(h1==h2);
       System.out.println(h1.haiClone==h2.haiClone);
		h2.y=80;
		h1.show();
		h2.show();
		h2.haiClone.x=2222;
		h1.show();
		h2.show();
	}

}
class haiClone
{
   int x;
   haiClone(int x)
   {
	   this.x=x;
   }
	
}
class helloClone implements Cloneable
{
 int y;
  haiClone haiClone;
  helloClone(int y,haiClone haiClone)
 {
	  
	  this.y=y;
	  this.haiClone=haiClone;
	  
	  
 }
  void show()
  {
	  System.out.println("hello"+y+"\t"+"haiClone"+haiClone.x);
	  
  }
  public Object clone () throws CloneNotSupportedException
  {
	  
	  return super.clone();
  }
  
}
