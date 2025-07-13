import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		long a=s.nextInt(),b=s.nextInt(),i;
		i=GCD(a,b);
		System.out.print((a*b)/i);
	}
	static long GCD(long j,long k){
		if(j%k==0)return k;
		return GCD(k,j%k);
	}
}