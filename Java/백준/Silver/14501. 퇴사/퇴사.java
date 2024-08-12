import java.util.*;
interface Main{
    static void main(String[]x){
        Scanner c=new Scanner(System.in);
        int N=i(c);int[] T=new int[N],P=new int[N],dp=new int[N+1];
        for(int i=0;i<N;i++){T[i]=i(c);P[i]=i(c);}
        for(int i=0;i<N;i++){
            if(i+T[i]<=N)dp[i+T[i]]=Math.max(dp[i+T[i]],dp[i]+P[i]);
            dp[i+1]=Math.max(dp[i+1],dp[i]);
        }
        System.out.print(dp[N]);
    }
    static int i(Scanner c){return c.nextInt();}
}