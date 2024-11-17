import java.util.*;
import java.io.*;
class Main{
	static int N,M,d[],v[],P1;
	static ArrayList<ArrayList<int[]>>list=new ArrayList<>();
	static StringBuilder sb=new StringBuilder();

	public static void main(String[]z)throws IOException{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer T=new StringTokenizer(S.readLine());
		N=Integer.parseInt(T.nextToken())+1;v=new int[N];d=new int[N];
		M=Integer.parseInt(T.nextToken());
		for(int i=0;i<N;i++)list.add(new ArrayList<>());
		Arrays.fill(d, Integer.MAX_VALUE);
		P1=Integer.parseInt(S.readLine());
		for(int n=0;n<M;n++){
			T=new StringTokenizer(S.readLine());
			int a=Integer.parseInt(T.nextToken()),
				b=Integer.parseInt(T.nextToken()),
				c=Integer.parseInt(T.nextToken());
			list.get(a).add(new int[]{b,c});
		}
		d[P1]=0;
		for(int n=1;n<N;n++){
			int min=Integer.MAX_VALUE;
			int idx=-1;
			for(int j=0;j<N;j++){
				if(v[j]==0&&min>d[j]){
					min=d[j];
					idx=j;
				}
			}
			if(idx==-1)break;
			v[idx]=1;
			for(int[] i : list.get(idx)) {
				if(v[i[0]]==0 && d[i[0]] > d[idx]+i[1]) {
					d[i[0]] = d[idx]+i[1];
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<N;i++)sb.append((d[i]!=Integer.MAX_VALUE?d[i]:"INF")+"\n");
		System.out.print(sb);
	}
}