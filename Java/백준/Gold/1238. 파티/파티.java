import java.util.*;
import java.io.*;
class Main{
	static int N,M,K,a[],b[],max=0;
	static ArrayList<ArrayList<int[]>>list1=new ArrayList<>();
	static ArrayList<ArrayList<int[]>>list2=new ArrayList<>();
	static PriorityQueue<int[]>p=new PriorityQueue<>((a,b)->a[1]-b[1]);
	public static void main(String[]z)throws IOException{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer T=new StringTokenizer(S.readLine());
		N=Integer.parseInt(T.nextToken())+1;
		M=Integer.parseInt(T.nextToken());
		K=Integer.parseInt(T.nextToken());
		for(int i=0;i<N;i++)list1.add(new ArrayList<>());
		for(int i=0;i<N;i++)list2.add(new ArrayList<>());
		for(int n=0;n<M;n++){
			T=new StringTokenizer(S.readLine());
			int a=Integer.parseInt(T.nextToken()),
				b=Integer.parseInt(T.nextToken()),
				c=Integer.parseInt(T.nextToken());
			list1.get(a).add(new int[]{b,c});
			list2.get(b).add(new int[]{a,c});
		}
		a=new int[N];
		b=new int[N];
		Arrays.fill(a,Integer.MAX_VALUE);
		Arrays.fill(b,Integer.MAX_VALUE);
		Dijkstra1();
		Dijkstra2();
		for(int i=1;i<N;i++)if(max<a[i]+b[i])max=a[i]+b[i];
		System.out.print(max);
	}
	static void Dijkstra1(){
		a[K]=0;
		p.add(new int[]{K,0});
		while(!p.isEmpty()){
			int[] P=p.poll();
			if(P[1]>a[P[0]])continue;
			for(int[]i: list1.get(P[0])){
				if(a[i[0]]>P[1]+i[1]){
					a[i[0]]=P[1]+i[1];
					p.add(new int[]{i[0],a[i[0]]});
				}
			}
		}
	}
	static void Dijkstra2(){
		b[K]=0;
		p.add(new int[]{K,0});
		while(!p.isEmpty()){
			int[] P=p.poll();
			if(P[1]>b[P[0]])continue;
			for(int[]i: list2.get(P[0])){
				if(b[i[0]]>P[1]+i[1]){
					b[i[0]]=P[1]+i[1];
					p.add(new int[]{i[0],b[i[0]]});
				}
			}
		}
	}
}