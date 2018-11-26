
public class lab542 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		student st=new student(99);
		System.out.println(st.sid);
		student st2=st.myclone();
		System.out.println(st2.sid);
		System.out.println(st==st2);
  
	}

}
interface JLCCloneable
{}
class student implements JLCCloneable 
{
int sid;
student (int sid)
{
this.sid=sid;
}
public student myclone() throws CloneNotSupportedException
{
	if(this instanceof JLCCloneable)
	
		return new student(sid);
	
	else 
	throw new CloneNotSupportedExceptiosn("Implement JLCCloneable");	
	
}
}



/*public class CloneNotSupportedException
extends Exception
Thrown to indicate that the clone method in class Object has been called to clone an object, but that the object's class does not implement the Cloneable interface.
Applications that override the clone method can also throw this exception to indicate that an object could not or should not be cloned.



Constructors
Constructor and Description
CloneNotSupportedException()
Constructs a CloneNotSupportedException with no detail message.
CloneNotSupportedException(String s)
Constructs a CloneNotSupportedException with the specified detail message.
*/