import java.io.*;
import java.util.*;
class Main{
	static int dx[]={0,-1,0,1},dy[]={-1,0,1,0},N,M,A[]={0,0};
	static char[][] a;
	static boolean[][] v;
	public static void main(String[]z)throws IOException{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(s.readLine());
		M=Integer.parseInt(t.nextToken());N=Integer.parseInt(t.nextToken());a=new char[N][M];
		v=new boolean[N][M];
		for(int i=0;i<N;i++)a[i]=s.readLine().toCharArray();
		for(int i=0;i<N;i++)for(int j=0;j<M;j++)if(!v[i][j]){
			int c=DSF(i,j,1);
			if(a[i][j]=='W')A[0]+=(c*c);
			else A[1]+=(c*c);
		}
		System.out.print(A[0]+" "+A[1]);
	}
	static int DSF(int i,int j,int c){
		v[i][j]=true;
		for(int d=0;d<4;d++){
			int x=dx[d]+i,y=dy[d]+j;
			if(x>=0&&y>=0&&x<N&&y<M&&!v[x][y]&&a[x][y]==a[i][j]){c+=DSF(x,y,1);}
		}
		return c;
	}
}