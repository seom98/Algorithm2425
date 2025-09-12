import java.util.*;

public class Main{
	public static int[]nums;
	public static int N,sum=0;
	public static boolean[]visited;
	public static StringBuilder sb=new StringBuilder();
	public static List<Integer>list=new ArrayList<>();

	public static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();nums=new int[N+1];visited=new boolean[N+1];
		for(int i=1;i<=N;i++)nums[i]=s.nextInt();
		for(int i=1;i<=N;i++){
			visited[i]=true;
			DFS(nums[i],i);
			visited[i]=false;
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i:list)sb.append(i).append("\n");
		System.out.print(sb);
	}

	public static void DFS(int idx,int start){
		if(idx==start){
			list.add(idx);
			return;
		}
		if(!visited[idx]){
			visited[idx]=true;
			DFS(nums[idx],start);
			visited[idx]=false;
		}
	}
}