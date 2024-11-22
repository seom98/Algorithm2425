import java.util.*;
import java.io.*;
class Main{
	static int N,a[][],d[][],dr[]={-1,0,1,0},dc[]={0,-1,0,1};
	static PriorityQueue<int[]>p=new PriorityQueue<>((a,b)->a[2]-b[2]);
	public static void main(String[]z){
		Scanner S=new Scanner(System.in);
		N=S.nextInt();
		a=new int[N][N];d=new int[N][N];
		for(int i=0;i<N;i++)Arrays.fill(d[i],Integer.MAX_VALUE);
		d[0][0]=0;
		for(int i=0;i<N;i++){
			String s=S.next();
			for(int j=0;j<N;j++)a[i][j]=s.charAt(j)-'0'==0?1:0;
		}
		Dijkstra();
		System.out.print(d[N-1][N-1]);
	}
	static void Dijkstra(){
		p.add(new int[]{0,0,0});
		while(!p.isEmpty()){
			int[] P=p.poll();
			if(P[2]>d[P[0]][P[1]])continue;
			for(int i=0;i<4;i++){
				int x=P[0]+dr[i],y=P[1]+dc[i];
				if(x>=0&&y>=0&&x<N&&y<N&&d[x][y]>P[2]+a[x][y]){
					d[x][y]=P[2]+a[x][y];
					p.add(new int[]{x,y,d[x][y]});
				}
			}
		}
	}
}