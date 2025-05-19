import java.io.*;
import java.util.*;
class Main{
	static int N,M,max=0,p=0,count[];
	static boolean visited[];
	static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
	public static void main(String[]z)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());M=Integer.parseInt(st.nextToken());
		count=new int[N+1];
		for(int i=0;i<=N;i++)list.add(new ArrayList<>());
		for(int i=0;i<M;i++){
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			list.get(b).add(a);
		}
		for(int i=1;i<=N;i++){
				visited=new boolean[N+1];
				DFS(i,i);
		}
		for(int i=1;i<=N;i++)max=count[i]>max?count[i]:max;
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++)if(max==count[i])sb.append(i).append(" ");
		System.out.print(sb);
	}
	static void DFS(int s,int i){
		visited[i]=true;
		for(int k:list.get(i)){
			if(!visited[k]){
				count[s]++;
				DFS(s,k);
			}
		}
	}
}