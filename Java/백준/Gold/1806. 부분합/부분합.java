import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),m=N+1,a[]=new int[m],S=0,E=0,T=0;
		for(int i=0;i<N;i++)a[i]=s.nextInt();
		while(S<=N&&E<=N){if(T>=M&&m>E-S)m=E-S;T=T<M?T+a[E++]:T-a[S++];}
		System.out.print(m==N+1?0:m);
	}
}