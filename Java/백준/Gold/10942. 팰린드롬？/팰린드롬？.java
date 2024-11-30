import java.io.*;
import java.util.*;
interface Main{
	static void main(String[]z)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine()),dp[][]=new int[N+1][N+1],a[]=new int[N+1],t,T;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++)a[i]=Integer.parseInt(st.nextToken());
		for(int i=1;i<=N;i++)dp[i][i]=1;
		for(int i=1;i<N;i++)if(a[i]==a[i+1])dp[i][i+1]=1;
		for(int i=2;i<N;i++)for(int j=1;j<=N-i;j++)if(a[j]==a[j+i]&&dp[j+1][j+i-1]==1)dp[j][j+i]=1;
		T=Integer.parseInt(br.readLine());
		while(T-->0){
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			sb.append(dp[x][y]).append("\n");
		}
		System.out.print(sb);
	}
}