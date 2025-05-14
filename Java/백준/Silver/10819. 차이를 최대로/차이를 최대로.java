import java.util.*;
class Main{
	static int N,arr[],ans[],a,sum,v[];
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();arr=new int[N];ans=new int[N];v=new int[N];
		for(int i=0;i<N;i++)arr[i]=s.nextInt();
		DFS(0);
		System.out.print(a);
	}
	static void DFS(int c){
		if(c==N){
			sum=0;
			for(int i=0;i<N-1;i++)sum+=Math.abs(ans[i]-ans[i+1]);
			a=Math.max(a,sum);
			return;
		}
		for(int i=0;i<N;i++){
			if(v[i]==0){
				ans[c]=arr[i];
				v[i]=1;
				DFS(c+1);
				v[i]=0;
			}
		}
	}
}