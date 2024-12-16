import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		long dp[][]=new long[100001][4],DP[]=new long[1000001];
		dp[1][1]=1;dp[2][2]=1;dp[3][1]=1;dp[3][2]=1;dp[3][3]=1;
		for(int i=4;i<=100000;i++){
			dp[i][1]=(dp[i-1][2]+dp[i-1][3])%1000000009;
			dp[i][2]=(dp[i-2][1]+dp[i-2][3])%1000000009;
			dp[i][3]=(dp[i-3][1]+dp[i-3][2])%1000000009;
		}
		while(T-->0){
			int N=s.nextInt();
			long b=(dp[N][1]+dp[N][2]+dp[N][3])%1000000009;
			System.out.println(b);
		}
	}
}