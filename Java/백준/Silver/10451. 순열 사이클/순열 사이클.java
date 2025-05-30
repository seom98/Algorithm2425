import java.util.*;
class Main{
	static ArrayList<Integer>list;
	static int T,N,C,arr[];
	static boolean[]visited;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		T=s.nextInt();
		while(T-->0){
			N=s.nextInt()+1;C=0;
			arr=new int[N];
			visited=new boolean[N];
			list=new ArrayList<>();
			for(int i=1;i<N;i++)arr[i]=s.nextInt();
			for(int i=1;i<N;i++)if(!visited[i]){C++;DFS(i);}
			System.out.println(C);
		}
	}
	static void DFS(int i){
		visited[i]=true;
		if(!visited[arr[i]])DFS(arr[i]);
	}
}