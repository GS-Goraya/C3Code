/*
 * @author Akshay
 */
public class lp {

	public static void main(String[] args) {
		
		Student11 s[]=new Student11[5];
		
		for(int i=0;i<s.length;i++) {
			s[i]=new Student11();
			//System.out.println(s[i]);
		}
		
		s[4]=s[1];
		//s[3]=s[0];
		
		s[0].details("A", 101, "BTM", 111);
		s[1].details("B", 102, "KTM", 222);
		s[2].details("C", 103, "AXA", 333);
		s[3].details("D", 104, "HSR", 444);
		//s[4].details("E", 105, "CSK", 555);
		//System.out.println(s[0].equals(s[5]));
		//System.out.println(s[0]);
		//System.out.println(s[4]);
		
		System.out.println("Searching for Duplicate Record.....");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++)
				if(s[i].equals(s[j]))
					System.out.println("Duplicate Record Found:"+"\t"+"s["+i+"],s["+j+"]");
		}
	}
}

class Student11{

	 String name;
	 int sid;
	 String city;
	 long phone;
	
	 void details(String a, int b, String c, long d) {
		name=a;
		sid=b;
		city=c;
		phone=d;
		System.out.println(name+"\t"+sid+"\t"+city+"\t"+phone+"\n");
	}
	
	 /*public String toString() {
		return name+"\t"+sid+"\t"+city+"\t"+phone;
	}*/
}