import java.util.*;
class Main{
	static int dr[]={-1,0,1,0},dc[]={0,-1,0,1},N,M,a[][],v[][][],num=0,C,U,D,L,R;
	static Queue<int[]>q=new LinkedList<>(),t=new LinkedList<>();
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();M=s.nextInt();a=new int[N][M];v=new int[N][M][2];
		for(int i=0;i<N;i++){z=s.next().split("");for(int j=0;j<M;j++)a[i][j]=z[j].charAt(0)-'0';}
		for(int i=0;i<N;i++)for(int j=0;j<M;j++)if(a[i][j]==0&&v[i][j][0]==0)BFS(i,j);
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(a[i][j]==1){
					U=L=R=D=0;
					if(i-1>=0){U=v[i-1][j][1];a[i][j]+=v[i-1][j][0];}
					if(j-1>=0)L=v[i][j-1][1];
					if(i+1<N)D=v[i+1][j][1];
					if(j+1<M)R=v[i][j+1][1];
					if(U!=L&&j-1>=0)a[i][j]+=v[i][j-1][0];
					if(U!=D&&L!=D&&i+1<N)a[i][j]+=v[i+1][j][0];
					if(U!=R&&L!=R&&D!=R&&j+1<M)a[i][j]+=v[i][j+1][0];
				}
			}
		}
		StringBuilder b=new StringBuilder();
		for(int i=0;i<N;i++){for(int j=0;j<M;j++)b.append(a[i][j]%10);b.append("\n");}
		System.out.print(b);
	}
	static void BFS(int x,int y){
		C=1;v[x][y][0]=1;v[x][y][1]=++num;
		q.add(new int[]{x,y});t.add(new int[]{x,y});
		while(!q.isEmpty()){
			int[]p=q.poll();
			for(int d=0;d<4;d++){
				int i=p[0]+dr[d],j=p[1]+dc[d];
				if(i<N&&j<M&&i>=0&&j>=0&&a[i][j]==0&&v[i][j][0]==0){
					C++;v[i][j][0]=1;v[i][j][1]=num;
					q.add(new int[]{i,j});t.add(new int[]{i,j});
				}
			}
		}
		while(!t.isEmpty()){int[]p=t.poll();v[p[0]][p[1]][0]=C;}
	}
}