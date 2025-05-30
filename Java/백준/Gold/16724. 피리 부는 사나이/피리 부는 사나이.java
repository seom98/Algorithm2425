import java.util.*;
import java.io.*;
class Main {
	static int N,M,T,C=0,a[][];
	static int[] dx={-1,0,1,0},dy={0,-1,0,1};//dlur
	static boolean[][]v;
	public static void main(String[]z) throws IOException{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(s.readLine());
		N=Integer.parseInt(t.nextToken());M=Integer.parseInt(t.nextToken());
		a=new int[N][M];v= new boolean[N][M];
		for(int i=0;i<N;i++){
			char[]k=s.readLine().toCharArray();
			for(int j=0;j<M;j++){
				switch(k[j]){
					case 'U':a[i][j]=0;break;
					case 'L':a[i][j]=1;break;
					case 'D':a[i][j]=2;break;
					case 'R':a[i][j]=3;break;
				}
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(!v[i][j]){DFS(i,j);C++;}
			}
		}
		System.out.print(C);
	}
	static void DFS(int i,int j){
		v[i][j]=true;
		for(int d=0;d<4;d++){
			int z=dx[d]+i,w=dy[d]+j;
			if(z>=0&&w>=0&&z<N&&w<M&&!v[z][w]){
				int n=dx[a[z][w]]+z,m=dy[a[z][w]]+w;
				if(n==i&&m==j)DFS(z,w);
			}
		}
		int x=dx[a[i][j]]+i,y=dy[a[i][j]]+j;
		if(x>=0&&y>=0&&x<N&&y<M&&!v[x][y])DFS(x,y);
	}
}