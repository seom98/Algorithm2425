import java.util.*;
class Main{
	static long MOD=1000000000,dp[][],a=0;
	static int N;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();dp=new long[N+1][10];
		for(int i=0;i<10;i++)dp[1][i]=1L;
		for(int i=1;i<10;i++)a+=r(N,i);
		System.out.print(a%MOD);
	}
	static long r(int d,int i){
		if(d==1)return dp[d][i];
		if(dp[d][i]==0){
			if(i==0)dp[d][i]=r(d-1,1);
			else if(i==9)dp[d][i]=r(d-1,8);
			else dp[d][i]=r(d-1,i-1)+r(d-1,i+1);
		}
		return dp[d][i]%MOD;
	}
}