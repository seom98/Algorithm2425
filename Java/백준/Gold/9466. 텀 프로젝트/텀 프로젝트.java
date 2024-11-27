import java.util.*;
import java.io.*;
class Main{
	static int arr[],vi[],vi2[],N,T,C;
	public static void main(String[]h)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		while(T-->0){
			N=Integer.parseInt(br.readLine());arr=new int[N+1];vi=new int[N+1];vi2=new int[N+1];C=N;
			StringTokenizer t=new StringTokenizer(br.readLine());
			for(int i=1;i<=N;i++)arr[i]=Integer.parseInt(t.nextToken());
			for(int i=1;i<=N;i++)if(vi2[i]==0)DFS(i);
			System.out.println(C);
		}
	}
	static void DFS(int i){
		if(vi[i]==1){vi2[i]=1;C--;}
		else vi[i]=1;
		if(vi2[arr[i]]==0)DFS(arr[i]);
		vi[i]=0;vi2[i]=1;
	}
}