import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),dp[][]=new int[N+1][3],r,g,b;
		for(int i=1;i<=N;i++){
			r=s.nextInt();g=s.nextInt();b=s.nextInt();
			dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+r;
			dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+g;
			dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1])+b;
		}
		System.out.print(Math.min(dp[N][0],Math.min(dp[N][1],dp[N][2])));
	}
}