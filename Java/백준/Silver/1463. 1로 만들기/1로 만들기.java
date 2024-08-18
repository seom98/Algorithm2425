interface Main{
	static void main(String[]z){
		int N=new java.util.Scanner(System.in).nextInt(),dp[]=new int[N+1];
		for(int i=2;i<=N;i++)dp[i]=Math.min(dp[i-1],Math.min(dp[i%2<1?i/2:i-1],dp[i%3<1?i/3:i-1]))+1;
		System.out.print(dp[N]);
	}
}