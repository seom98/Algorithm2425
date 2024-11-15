import java.util.*;
import java.io.*;
class Main{
	static int N,C=0,v[],P1,S=1;
	static ArrayList<ArrayList<int[]>>list=new ArrayList<>();
	static StringBuilder sb=new StringBuilder();

	public static void main(String[]z)throws IOException{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(S.readLine())+1;v=new int[N];
		for(int n=0;n<N;n++)list.add(new ArrayList<>());
		StringTokenizer T;
		for(int n=1;n<N;n++){
			T=new StringTokenizer(S.readLine());
			int V=Integer.parseInt(T.nextToken()),
				L=Integer.parseInt(T.nextToken()),
				R=Integer.parseInt(T.nextToken());

			list.get(V).add(new int[]{L,0});
			list.get(V).add(new int[]{R,1});
		}
		DFS(1,0);
		System.out.print(C-1);
//		System.out.print(sb);
	}
	static void DFS(int p,int h){
		sb.append(p + " ");
		C++;
		v[p]=1;
		S++;
		int l=list.get(p).get(0)[0];
		int r=list.get(p).get(1)[0];
		if(l!=-1&&v[l]==0){
			DFS(l,1);
			sb.append(p + " ");
			C++;
		}
		if(r!=-1&&v[r]==0) {
			DFS(r,h);
			if (h==1){
				sb.append(p + " ");
				C++;
			}
		}
	}
}