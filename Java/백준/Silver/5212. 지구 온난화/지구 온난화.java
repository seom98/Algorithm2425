import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),U=N,D=0,L=M,R=0,c,x,y;
		int[]dx={-1,0,1,0},dy={0,-1,0,1};
		char[][]arr=new char[N][M],b=new char[N][M];
		for(int i=0;i<N;i++)arr[i]=s.next().toCharArray();
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(arr[i][j]=='X'){
					c=0;
					for(int d=0;d<4;d++){
						x=dx[d]+i;y=dy[d]+j;
						if(x>=0&&y>=0&&x<N&&y<M&&arr[x][y]=='X')c++;
					}
					b[i][j]=c>=2?'X':'.';
				}
				else b[i][j]='.';
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(b[i][j]=='X'){
					if(U>i)U=i;
					if(L>j)L=j;
					if(i>D)D=i;
					if(j>R)R=j;
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=U;i<=D;i++){
			for(int j=L;j<=R;j++)sb.append(b[i][j]);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}