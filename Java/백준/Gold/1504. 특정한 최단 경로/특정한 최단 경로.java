import java.util.*;
import java.io.*;
class Main{
	static int N,M,d[],A,B;
	static ArrayList<ArrayList<int[]>>list=new ArrayList<>();
	static PriorityQueue<int[]>p=new PriorityQueue<>((a,b)->a[1]-b[1]);
	public static void main(String[]z)throws IOException{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer T=new StringTokenizer(S.readLine());
		N=Integer.parseInt(T.nextToken())+1;
		M=Integer.parseInt(T.nextToken());
		for(int i=0;i<N;i++)list.add(new ArrayList<>());
		for(int n=0;n<M;n++){
			T=new StringTokenizer(S.readLine());
			int a=Integer.parseInt(T.nextToken()),
				b=Integer.parseInt(T.nextToken()),
				c=Integer.parseInt(T.nextToken());
			list.get(a).add(new int[]{b,c});
			list.get(b).add(new int[]{a,c});
		}
		T=new StringTokenizer(S.readLine());
		A=Integer.parseInt(T.nextToken());
		B=Integer.parseInt(T.nextToken());
		int A1=Dijkstra(1,A),
			A2=Dijkstra(A,B),
			A3=Dijkstra(B,N-1),
			B1=Dijkstra(1,B),
			B2=Dijkstra(B,A),
			B3=Dijkstra(A,N-1);
		if(A1>=0&&A2>=0&&A3>=0)A=A1+A2+A3;
		else A=-1;
		if(B1>=0&&B2>=0&&B3>=0)B=B1+B2+B3;
		else B=-1;
		System.out.print(A!=-1&&B!=-1?Math.min(A,B):Math.max(A,B));
	}
	static int Dijkstra(int P1,int P2){
		d=new int[N];
		Arrays.fill(d,Integer.MAX_VALUE);
		d[P1]=0;
		p.add(new int[]{P1,0});
		while(!p.isEmpty()){
			int[] P=p.poll();
			if(P[1]>d[P[0]])continue;
			for(int[]i: list.get(P[0])){
				if(d[i[0]]>P[1]+i[1]){
					d[i[0]]=P[1]+i[1];
					p.add(new int[]{i[0],d[i[0]]});
				}
			}
		}
		return d[P2]!=Integer.MAX_VALUE?d[P2]:-1;
	}
}