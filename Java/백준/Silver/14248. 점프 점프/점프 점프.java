import java.util.*;
class Main{
	static int N,a[],c=0,v[],d[]={-1,1},y;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();a=new int[N+1];v=new int[N+1];
		for(int i=1;i<=N;i++)a[i]=s.nextInt();
		y=s.nextInt();DFS(y);
		System.out.print(c);
	}
	static void DFS(int k){
		if(k<1||k>N||v[k]==1)return;
		v[k]=1;c++;
		DFS(k+a[k]);DFS(k-a[k]);
	}
}