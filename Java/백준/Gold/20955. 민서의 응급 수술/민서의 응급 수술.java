import java.util.*;
import java.io.*;
class Main{
	static int N,M,v[],ans=0,cnt=0;
	public static void main(String[]z)throws IOException{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer T=new StringTokenizer(S.readLine());
		N=Integer.parseInt(T.nextToken())+1;
		v=new int[N];
		Arrays.fill(v,-1);
		M=Integer.parseInt(T.nextToken());

		for(int n=0;n<M;n++){
			T=new StringTokenizer(S.readLine());
			int a=Integer.parseInt(T.nextToken()),
				b=Integer.parseInt(T.nextToken());
			if(!union(a,b))ans++;
		}
		for(int i=1;i<N;i++){
			if(v[i]<0)cnt++;
		}
		System.out.print(ans+cnt-1);
	}
	static int find(int i){
		if(v[i]<0)return i;
		return v[i]=find(v[i]);
	}
	static boolean union(int a,int b){
		int x=find(a);
		int y=find(b);
		if(x==y)return false;
		v[x]=y;
		return true;
	}
}