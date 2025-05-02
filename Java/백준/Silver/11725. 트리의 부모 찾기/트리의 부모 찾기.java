import java.util.*;
class Main {
	static int N;
	static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
	static boolean[]visited;
	static int[]p;
	public static void main(String[] z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		visited=new boolean[N+1];
		p=new int[N+1];
		for(int n=0;n<=N;n++)list.add(new ArrayList<Integer>());
		for(int m=1;m<N;m++){
			int i=s.nextInt(),j=s.nextInt();
			list.get(i).add(j);
			list.get(j).add(i);
		}
		DFS(1);
		StringBuilder sb=new StringBuilder();
		for(int m=2;m<=N;m++)sb.append(p[m]+"\n");
		System.out.print(sb);
	}
	static void DFS(int index){
		visited[index]=true;
		for(int k:list.get(index)){
			if(!visited[k]){
				p[k]=index;
				DFS(k);
			}
		}
	}
}