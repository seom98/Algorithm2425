import java.util.*;
class Main {
	static int dr[]={-1,0,1,0},dc[]={0,1,0,-1},N,M,a[][],d[][],C;
	static Set<p>s;
	static class p{int x,y;p(int x, int y){this.x=x;this.y=y;}
		@Override
		public boolean equals(Object o){p other=(p)o;return x==other.x&&y==other.y;}
		@Override
		public int hashCode(){return Objects.hash(x,y);}
	}
	public static void main(String[]z){
		Scanner c=new Scanner(System.in);
		N=c.nextInt();M=c.nextInt();a=new int[N][M];d=new int[N][M];
		for(int i=0;i<N;i++){
			String l=c.next();
			for(int j=0;j<M;j++){
				char k=l.charAt(j);a[i][j]=k=='U'?0:k=='R'?1:k=='D'?2:3;
			}
		}
		for(int i=0;i<N;i++){for(int j=0;j<M;j++){if(d[i][j]<1){s=new HashSet<>();dfs(i,j);}}}
		System.out.print(C);
	}
	static void dfs(int i,int j){
		if(i>=N||j>=M||i<0||j<0||d[i][j]==1){for(p e:s){d[e.x][e.y]=1;C++;}return;}
		else if(s.contains(new p(i,j))||d[i][j]==2){for(p e:s)d[e.x][e.y]=2;return;}
		s.add(new p(i,j));dfs(i+dr[a[i][j]],j+dc[a[i][j]]);
	}
}