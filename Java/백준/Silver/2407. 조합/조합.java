import java.util.*;
import java.math.BigInteger;
interface Main{
	public static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt();
		BigInteger n=BigInteger.ONE;
		BigInteger m=BigInteger.ONE;
		for (int i=0;i<M;i++){
			n=n.multiply(new BigInteger(String.valueOf(N-i)));
			m=m.multiply(new BigInteger(String.valueOf(i+1)));
		}
		BigInteger a=n.divide(m);
		System.out.print(a);
	}
}