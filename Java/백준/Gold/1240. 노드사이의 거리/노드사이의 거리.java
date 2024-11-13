import java.util.*;
class Main{
	static int N,M,P1,P2,visited[];
	static StringBuilder sb=new StringBuilder();
	static ArrayList<ArrayList<int[]>>list=new ArrayList<>();
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt()+1;M=s.nextInt();
		for(int n=0;n<N;n++)list.add(new ArrayList<>());
		for(int n=2;n<N;n++){
			int i=s.nextInt(),j=s.nextInt(),k= s.nextInt();
			list.get(i).add(new int[]{j,k});
			list.get(j).add(new int[]{i,k});
		}
		while(M-->0){
			P1=s.nextInt();P2= s.nextInt();
			visited=new int[N];
			DFS(P1,0);
		}
		System.out.print(sb);
	}
	static void DFS(int now,int sum){
		if(now==P2){
			sb.append(sum+"\n");
			return;
		}
		visited[now]=1;
		for(int[] i:list.get(now)){
			if(visited[i[0]]==0){
				DFS(i[0],sum+i[1]);
				visited[i[0]]=0;
			}
		}
	}
}