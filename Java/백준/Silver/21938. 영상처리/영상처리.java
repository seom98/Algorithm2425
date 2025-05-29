import java.util.*;
import java.io.*;
class Main {
	static int N,M,T,C=0,a[][];
	static int[] dx={-1,0,1,0},dy={0,-1,0,1};
	static boolean[][]v;
	public static void main(String[]z) throws IOException{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(s.readLine());
		N=Integer.parseInt(t.nextToken());M=Integer.parseInt(t.nextToken());
		a=new int[N][M];v= new boolean[N][M];
		for(int i=0;i<N;i++){
			t=new StringTokenizer(s.readLine());
			for(int j=0;j<M;j++)for(int k=0;k<3;k++)a[i][j]+=Integer.parseInt(t.nextToken());
		}
		T=Integer.parseInt(s.readLine())*3;
		for(int i=0;i<N;i++)for(int j=0;j<M;j++)a[i][j]=a[i][j]>=T?1:0;
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(!v[i][j]&&a[i][j]==1){DFS(i,j);C++;}
			}
		}
		System.out.print(C);
	}
	static void DFS(int i,int j){
		v[i][j]=true;
		for(int d=0;d<4;d++){
			int x=dx[d]+i,y=dy[d]+j;
			if(x>=0&&y>=0&&x<N&&y<M&&!v[x][y]&&a[x][y]==1)DFS(x,y);
		}
	}
}