import java.util.*;
class Main {
	static int N,M,T,C=0,a[][];
	static int[] dx={-1,0,1,0},dy={0,-1,0,1};
	static boolean[][]v;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();M=s.nextInt();
		a=new int[N][M];v= new boolean[N][M];
		for(int i=0;i<N;i++)for(int j=0;j<M;j++)a[i][j]=s.nextInt()+s.nextInt()+s.nextInt();
		T=s.nextInt()*3;
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