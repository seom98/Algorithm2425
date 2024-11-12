import java.util.*;
class Main{
	static int N,M,P,visited[];
	static StringBuilder sb=new StringBuilder();
	static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt()+1;M=s.nextInt();P=s.nextInt();
		visited=new int[N];
		for(int i=0;i<N;i++)list.add(new ArrayList<>());
		while(M-->0){
			int i=s.nextInt(),j=s.nextInt();
			list.get(i).add(j);
			list.get(j).add(i);
		}
		for(int i=1;i<N;i++)Collections.sort(list.get(i));
		DFS(P);
		sb.append('\n');
		visited=new int[N];
		BFS();
		System.out.print(sb);
	}
	static void BFS(){
		Queue<Integer>q=new LinkedList<>();
		q.add(P);
		sb.append(P+" ");
		visited[P]=1;
		while(!q.isEmpty()){
			int now= q.poll();
			for(int i:list.get(now)){
				if(visited[i]==0){
					visited[i]=1;
					sb.append(i+" ");
					q.add(i);
				}
			}
		}
	}
	static void DFS(int now){
		visited[now]=1;
		sb.append(now+" ");
		for(int i:list.get(now)){
			if(visited[i]==0)DFS(i);
		}
	}
}