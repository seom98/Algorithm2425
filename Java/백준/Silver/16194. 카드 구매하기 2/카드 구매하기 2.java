import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),dp[]=new int[N+1],a[]=new int[N+1];
		for(int i=1;i<=N;i++){a[i]=s.nextInt();dp[i]=a[i];}
		for(int i=1;i<=N;i++)
			for(int j=1;j<=i;j++)dp[i]=Math.min(dp[i],dp[i-j]+a[j]);
		System.out.print(dp[N]);
	}
}