import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),T=0,i,j;int[]dx={0,0,-1,1},dy={-1,1,0,0};
		char[][]A=new char[N][M];boolean[][]V=new boolean[N][M];
		Queue<int[]>Q=new LinkedList<>();Queue<int[]>B=new LinkedList<>();
		for(i=0;i<N;i++){
			A[i]=s.next().toCharArray();
			for(j=0;j<M;j++){
				if(A[i][j]=='*'){B.add(new int[]{i,j});V[i][j]=true;}
				if(A[i][j]=='X')V[i][j]=true;
				if(A[i][j]=='S'){Q.add(new int[]{i,j,0});V[i][j]=true;}
			}
		}
		while(!Q.isEmpty()){
			int Bs=B.size(),Qs=Q.size();
			while(Bs-->0){
				int p[]=B.poll();
				for(int d=0;d<4;d++){
					int a=p[0]+dx[d],b=p[1]+dy[d];
					if(a>=0&&b>=0&&a<N&&b<M&&!V[a][b]&&A[a][b]!='D'){
						V[a][b]=true;B.add(new int[]{a,b});
					}
				}
			}
			while(Qs-->0){
				int p[]=Q.poll();
				for(int d=0;d<4;d++){
					int a=p[0]+dx[d],b=p[1]+dy[d],c=p[2]+1;
					if(a>=0&&b>=0&&a<N&&b<M&&!V[a][b]){
						if(A[a][b]=='D'){System.out.print(c);return;}
						V[a][b]=true;Q.add(new int[]{a,b,c});
					}
				}
			}
		}
		System.out.print("KAKTUS");
	}
}