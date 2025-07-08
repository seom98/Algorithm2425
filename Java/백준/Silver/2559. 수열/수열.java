import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),i,max=Integer.MIN_VALUE,a[]=new int[N+1];a[1]=s.nextInt();
		for(i=2;i<=N;i++)a[i]=a[i-1]+s.nextInt();
		for(i=0;i<=N-M;i++)max=Math.max(max,a[i+M]-a[i]);
		System.out.print(max);
	}
}