import java.util.*;
class Main {
	static int N,M,count=0;
	static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
	static boolean[]visited;
	public static void main(String[] z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();M=s.nextInt();
		visited=new boolean[N+1];
		for(int n=0;n<=N;n++)list.add(new ArrayList<Integer>());
		for(int m=0;m<M;m++){
			int i=s.nextInt(),j=s.nextInt();
			list.get(i).add(j);
			list.get(j).add(i);
		}
		for(int n=1;n<=N;n++)
			if(!visited[n]){DFS(n);count++;}

		System.out.print(count);
	}
	static void DFS(int index){
		visited[index]=true;
		for(int k:list.get(index))
			if(!visited[k])DFS(k);
	}
}