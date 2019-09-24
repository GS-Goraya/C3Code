package program99;
public class Lab20 {
	public static void main(String[] args) {
		  

		int limit= 1000;
		int total=0;
		for(int num=2;num<=limit;num++)
		{
		int sum=0;
		int num1= num;
		while(num!=0)
		{
		int digit =num1%10;
		sum=sum+(digit*digit*digit);
         num1=num1/10;
         
		}
		if(sum==num)
		
			total=total+sum;
		
		}
		  System.out.print("hello");
			}
	
		
}