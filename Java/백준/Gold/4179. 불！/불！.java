import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int r[]={0,1,0,-1},c[]={1,0,-1,0},H=s.nextInt(),W=s.nextInt(),T=0,A,B,x,y;
		char[][]m=new char[H][W];boolean[][]v=new boolean[H][W];
		Queue<int[]>J=new LinkedList<>(),F=new LinkedList<>();
		for(int i=0;i<H;i++){String S=s.next();
			for(int j=0;j<W;j++){m[i][j]=S.charAt(j);
				if(m[i][j]=='J'){J.add(new int[]{i,j});m[i][j]='.';}
				else if(m[i][j]=='F')F.add(new int[]{i,j});
			}
		}
		l:while(true){T++;A=F.size();B=J.size();
			while(A-->0){int[]f=F.poll();
				for(int d=0;d<4;d++){
					x=f[0]+c[d];y=f[1]+r[d];
					if(x>=0&&y>=0&&x<H&&y<W&&m[x][y]=='.'){F.add(new int[]{x,y});m[x][y]='F';}
				}
			}
			while(B-->0){int[]q=J.poll();
				for(int d=0;d<4;d++){
					x=q[0]+c[d];y=q[1]+r[d];
					if(x<0||y<0||x>=H||y>=W){System.out.print(T);break l;}
					if(m[x][y]=='.'&&!v[x][y]){v[x][y]=true;J.add(new int[]{x,y});}
				}
			}
			if(J.isEmpty()){System.out.print("IMPOSSIBLE");break;}
		}
	}
}