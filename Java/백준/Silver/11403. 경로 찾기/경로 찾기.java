import java.util.*;
class Main{
	static int N,a[][],v[][],x,y,i,j;
	static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);StringBuilder b=new StringBuilder();
		N=s.nextInt();a=new int[N][N];v=new int[N][N];
		for(i=0;i<N;i++)list.add(new ArrayList<>());
		for(i=0;i<N;i++)for(j=0;j<N;j++){x=s.nextInt();if(x>0){list.get(i).add(j);a[i][j]=1;}}
		for(i=0;i<N;i++)for(j=0;j<N;j++)if(a[i][j]>0&&v[i][j]<1)DFS(i,j);
		for(i=0;i<N;i++)for(j=0;j<N;j++)System.out.print(N-j==1?a[i][j]+"\n":a[i][j]+" ");
	}
	static void DFS(int i,int j){
		if(v[i][j]>0)return;v[i][j]=1;
		for(int k:list.get(j)){if(v[i][k]<1){a[i][k]=1;DFS(i,k);}}
	}
}