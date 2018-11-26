import java.math.BigInteger;

public class lab534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BigInteger bint1=new BigInteger("4");
    System.out.println("B:  "+bint1.bitCount());
    //Number of 1 bit
    System.out.println("L  "+bint1.bitLength());
    //number of total bits allocated
    long val=9223372036854775807L;  ///Max value of long
    long val2=100;
    long res=val+val2;
    System.out.println(res);
	}

}
