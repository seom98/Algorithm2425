import java.math.BigInteger;
import java.util.*;
interface Main {
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),i=2;
		BigInteger[]a=new BigInteger[10001];
		a[0]=new BigInteger("0");
		a[1]=new BigInteger("1");
		for(;i<=N;i++)a[i]=a[i-1].add(a[i-2]);
		System.out.print(a[N]);
	}
}