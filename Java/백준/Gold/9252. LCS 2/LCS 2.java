import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		Stack<Character>stack=new Stack<Character>();
		char[]a=s.next().toCharArray(),b=s.next().toCharArray();
		int c=a.length,d=b.length,dp[][]=new int[d+1][c+1];
		for(int i=1;i<=d;i++){char C=b[i-1];
			for(int j=1;j<=c;j++){
				if(C==a[j-1])dp[i][j]=dp[i-1][j-1]+1;
				else dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
			}
		}
		sb.append(dp[d][c]+"\n");
		int now=dp[d][c];
		while(0<d&&0<c&&now>0){
			if(dp[d-1][c]==now)d--;
			else if(dp[d][c-1] == now)c--;
			else{
				d--;c--;now--;
				stack.push(a[c]);
			}
		}
		while(!stack.isEmpty())sb.append(stack.pop());
		System.out.print(sb);
	}
}