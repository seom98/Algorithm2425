import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),i;long x=0,y=0,I=0,S,M=s.nextLong(),t[]=new long[N];
		for(i=0;i<N;i++){t[i]=s.nextLong();if(t[i]>y)y=t[i];}
		while(x<y){I=(x+y)/2;S=0;for(i=0;i<N;i++)if(t[i]-I>0)S+=t[i]-I;if(S<M)y=I;else x=I+1;}
		System.out.print(x-1);
	}
}