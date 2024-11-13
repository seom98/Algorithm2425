import java.util.*;
import java.io.*;
class Main{
	static int N,MAX=0,v[],P1;
	static ArrayList<ArrayList<int[]>>list=new ArrayList<>();

	public static void main(String[]z)throws IOException{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(S.readLine())+1;v=new int[N];
		for(int n=0;n<N;n++)list.add(new ArrayList<>());
		StringTokenizer T;
		for(int n=1;n<N;n++){
			T=new StringTokenizer(S.readLine());
			int V=Integer.parseInt(T.nextToken());
			while(true){
				int next=Integer.parseInt(T.nextToken());
				if(next==-1)break;
				int i=next,j=Integer.parseInt(T.nextToken());
				list.get(V).add(new int[]{i,j});
			}
		}
		DFS(1,0);
		v=new int[N];
		DFS(P1,0);
		System.out.print(MAX);
	}
	static void DFS(int p, int l){
		if(MAX<l) {
			MAX=l;
			P1=p;
		}
		v[p]=1;
		for(int[] i:list.get(p)) {
			int[] next=i;
			if(v[next[0]]==0) {
				DFS(next[0],l+next[1]);
			}
		}
	}
}