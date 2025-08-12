import java.util.*;
interface Main{
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),dp[]=new int[N+1],i,j;dp[1]=1;
		for(i=2;i<=N;i++){
			dp[i]=dp[i-1];
			for(j=1;j*j<=i;j++)dp[i]=Math.min(dp[i],dp[i-(j*j)]);
			dp[i]++;
		}
		System.out.print(dp[N]);
	}
}