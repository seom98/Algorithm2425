import java.util.*;
import java.io.*;
class Main{
	static int N,M,v[],ans=0,CNT,SIZE;
	static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
	static PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
	static StringBuilder sb=new StringBuilder();
	static Queue<Integer>queue=new LinkedList<>();
	public static void main(String[]z)throws IOException{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer T=new StringTokenizer(S.readLine());
		N=Integer.parseInt(T.nextToken())+1;
		for(int i=0;i<N;i++)list.add(new ArrayList<>());

		while(true){
			T=new StringTokenizer(S.readLine());
			int a=Integer.parseInt(T.nextToken()),
				b=Integer.parseInt(T.nextToken());
			if(a==-1)break;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		f:for(int n=1;n<N-1;n++){ // 한번부터 N번만에 모든노드에 접근
			for(int i=1;i<N;i++){ // 1번노드부터 N번 노드부터 시작하기
				BFS(n,i);
			}
//			System.out.println();
			if(SIZE>0){
				sb.append(n).append(" ").append(SIZE).append("\n");
				break f;
			}
		}
		for(int i:priorityQueue)sb.append(i).append(" ");
		System.out.print(sb);
	}
	static void BFS(int n,int i){
		v=new int[N];
		v[i]=1;
		queue.clear();
		queue.add(i);
		queue.add(-1);
		CNT=1;
		while(n>0){
			int P=queue.poll();
			if(P==-1){ // 한다리만큼 끝나면 다음다리
				n--;
				queue.add(P);
			}else{
				for(int x:list.get(P)){
					if(v[x]==0){
						CNT++;
						v[x]=1;
						queue.add(x);
					}
				}
			}
		}
		// 여기서 이제 모든 공간에 온적이 있게되면 i를 우선순위큐에 넣어주자.
//		for(int k:v)System.out.print(k+" ");
//		System.out.println();
		if(CNT==N-1){
			priorityQueue.add(i);
			SIZE++;
		}
	}
}