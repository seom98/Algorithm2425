import java.util.*;
class Main{
	static int N,M,A=0,j,k;
	static ArrayList<ArrayList<Integer>>a=new ArrayList<>();
	static boolean[]v;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();M=s.nextInt();
		v=new boolean[N+1];v[1]=true;
		for(int i=0;i<=N;i++)a.add(new ArrayList<>());
		for(int i=0;i<M;i++){
			j=s.nextInt();k=s.nextInt();
			a.get(j).add(k);
			a.get(k).add(j);
		}
		dfs(1,0);
		for(int i=2;i<=N;i++){if(v[i])A++;}
		System.out.print(A);
	}
	static void dfs(int p,int c){
		if(c==2)return;
		for(int i:a.get(p)){v[i]=true;dfs(i,c+1);}
	}
}