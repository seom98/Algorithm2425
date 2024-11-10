import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),K=s.nextInt(),a[][]=new int[N][M],v[][][]=new int[N][M][K+1],dr[]={0,1,0,-1},dc[]={1,0,-1,0},p[],di,dj,m=1000000;
		Queue<int[]>q=new LinkedList<>();
		for(int i=0;i<N;i++){
			String str=s.next();
			for(int j=0;j<M;j++){
				a[i][j]=str.charAt(j)-'0';
				for(int k=0;k<=K;k++)v[i][j][k]=1000000;
			}
		}
		q.add(new int[]{0,0,0,1});
		v[0][0][0]=1;
		while(!q.isEmpty()){
			p=q.poll();
			if(p[0]==N-1&&p[1]==M-1){if(m>p[3])m=p[3];continue;}
			for(int d=0;d<4;d++){
				di=p[0]+dr[d];
				dj=p[1]+dc[d];
				if(di<N&&dj<M&&di>=0&&dj>=0){
					if(a[di][dj]==0){
						if(v[di][dj][p[2]]>p[3]+1){
							v[di][dj][p[2]]=p[3]+1;
							q.add(new int[]{di,dj,p[2],p[3]+1});
						}
					}
					else if(p[2]<K){
						if(v[di][dj][p[2]+1]>p[3]+1){
							v[di][dj][p[2]+1]=p[3]+1;
							q.add(new int[]{di,dj,p[2]+1,p[3]+1});
						}
					}
				}
			}
		}
		System.out.print(m==1000000?-1:m);
	}
}