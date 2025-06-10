import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();long[]d=new long[N+1],w=new long[N+1];
		for(int i=1;i<=N;i++)w[i]=s.nextLong();
		if(N==1){System.out.print(w[1]);return;}
		d[1]=w[1];d[2]=w[1]+w[2];
		for(int i=3;i<=N;i++)d[i]=Math.max(Math.max(d[i-1],d[i-2]+w[i]),d[i-3]+w[i]+w[i-1]);
		System.out.print(d[N]);
	}
}