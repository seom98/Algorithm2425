import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		StringBuilder S=new StringBuilder();
		l:while(true){
			int L=s.nextInt(),R=s.nextInt(),C=s.nextInt(),i,j,k;
			if(L==0)break;
			int[]dz={0,0,0,0,-1,1},dx={0,0,-1,1,0,0},dy={-1,1,0,0,0,0};
			char A[][][]=new char[L][R][C];
			boolean V[][][]=new boolean[L][R][C];
			Queue<int[]>q=new LinkedList<>();
			for(i=0;i<L;i++)for(j=0;j<R;j++){
				String T=s.next();
				A[i][j]=T.toCharArray();
				for(k=0;k<C;k++)if(A[i][j][k]=='S')q.add(new int[]{i,j,k,0});
			}
			while(!q.isEmpty()){
				int p[]=q.poll();
				for(int d=0;d<6;d++){
					int a=p[0]+dz[d],b=p[1]+dx[d],c=p[2]+dy[d],count=p[3]+1;
					if(a>=0&&b>=0&&c>=0&&a<L&&b<R&&c<C){
						if(A[a][b][c]=='E'){
							S.append("Escaped in "+count+" minute(s).\n");
							continue l;
						}
						if(A[a][b][c]=='.'&&!V[a][b][c]){
							V[a][b][c]=true;
							q.add(new int[]{a,b,c,count});
						}
					}
				}
			}
			S.append("Trapped!\n");
		}
		System.out.print(S);
	}
}