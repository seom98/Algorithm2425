import java.util.*;
class Main{
	static int N,M,K,C=0,a[][],v[][]=new int[10][2],min=2500,m,p[],di,dj,c[][],Z=0,size;
	static int[] result,nums,visited,dr={0,1,0,-1},dc={1,0,-1,0};
	static Queue<int[]>q=new LinkedList<>();
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		M=s.nextInt();
		a=new int[N][N];
		c=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				K=s.nextInt();
				a[i][j]=K;
				if(K==2){v[C][0]=i;v[C++][1]=j;}
				else if(K==0)Z++;
			}
		}
		nums=new int[C];result=new int[C];visited=new int[C];
		for(int i=0;i<C;i++)nums[i]=i;
		NM(0,0);
		System.out.print(min==2500?-1:min);
	}
	static void NM(int x,int d){
		if(d==M){
			for(int i=0;i<N;i++){for(int j=0;j<N;j++)c[i][j]=a[i][j];}
			for(int i=0;i<M;i++){
				int r=result[i];
				q.add(new int[]{v[r][0],v[r][1]});
				c[v[r][0]][v[r][1]]=1;
			}
			m=BFS(0,Z+C-M);
			if(m<min)min=m;
			return;
		}
		for(int i=x;i<C;i++){
			if(visited[i]==0){
				result[d]=nums[i];
				visited[i]=1;
				NM(i,d+1);
				visited[i]=0;
			}
		}
	}
	static int BFS(int sec,int zero){
		while(true){
			size=q.size();
			if(size==0)break;
			while(size-->0){
				p=q.poll();
				for(int d=0;d<4;d++){
					di=p[0]+dr[d];
					dj=p[1]+dc[d];
					if(di<N&&dj<N&&di>=0&&dj>=0&&c[di][dj]!=1){
						c[di][dj]=1;
						q.add(new int[]{di,dj});
						zero--;
					}
				}
			}
			sec++;
		}
		return zero!=0?2500:sec-1;
	}
}