import java.util.*;
interface Main{
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),dp[]=new int[N],a[]=new int[N],i,j,ans=0;
		for(i=0;i<N;i++)a[i]=s.nextInt();
		for(i=0;i<N;i++){
			dp[i]=a[i];
			for(j=0;j<i;j++){
				if(a[j]<a[i]){
					dp[i]=Math.max(dp[i],dp[j]+a[i]);
				}
			}
			ans=Math.max(ans,dp[i]);
		}
		System.out.print(ans);
	}
}