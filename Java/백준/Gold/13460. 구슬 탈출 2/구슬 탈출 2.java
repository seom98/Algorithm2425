import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),map[][]=new int[N][M],r[]={0,0},b[]={0,0},c[][][][]=new int[N][M][N][M],
			dx[]={0,1,0,-1},dy[]={1,0,-1,0},min=Integer.MAX_VALUE,A,B,C,D;
		for(int i=0;i<N;i++){
			String l=s.next();
			for(int j=0;j<M;j++){
				int n=l.charAt(j)-35;map[i][j]=n;
				if(n==47)r=new int[]{i,j};
				if(n==31)b=new int[]{i,j};
			}
		}
		Queue<int[]>q=new LinkedList<>();
		q.add(new int[]{r[0],r[1],b[0],b[1],0});
		c[r[0]][r[1]][b[0]][b[1]]=1;
		while(!q.isEmpty()){
			int p[]=q.poll(),l=p[4];
			if(l>=10)break;
			for(int i=0;i<4;i++){
				A=p[0];B=p[1];C=p[2];D=p[3];
				while(map[A+dx[i]][B+dy[i]]!=0){
					A+=dx[i];B+=dy[i];
					if(map[A][B]==44)break;
				}
				while(map[C+dx[i]][D+dy[i]]!=0){
					C+=dx[i];D+=dy[i];
					if(map[C][D]==44)break;
				}
				if(map[C][D]==44)continue;
				if(map[A][B]==44&&min>l+1){min=l+1;break;}
				if(A==C&&B==D&&map[A][B]!=44){
					if(Math.abs(A-p[0])+Math.abs(B-p[1])>Math.abs(C-p[2])+Math.abs(D-p[3])){A-=dx[i];B-=dy[i];}
					else{C-=dx[i];D-=dy[i];}
				}
				if(c[A][B][C][D]<1){
					c[A][B][C][D]=1;
					q.add(new int[]{A,B,C,D,l+1});
				}
			}
		}
		System.out.print(min==Integer.MAX_VALUE?-1:min);
	}
}