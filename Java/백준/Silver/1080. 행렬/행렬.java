import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),t=0;
		char[][] a=new char[N][M],b=new char[N][M];
		for(int i=0;i<N;i++)a[i]=s.next().toCharArray();
		for(int i=0;i<N;i++)b[i]=s.next().toCharArray();
		if(N<3||M<3){
			t=1;
			l:for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					if(a[i][j]!=b[i][j]){
						t=0;break l;
					}
				}
			}
			System.out.print(t==1?0:-1);
			return;
		}
		for(int i=0;i<N-2;i++){
			for(int j=0;j<M-2;j++){
				if(a[i][j]!=b[i][j]){
					for(int x=i;x<i+3;x++){
						for(int y=j;y<j+3;y++)a[x][y]=a[x][y]=='0'?'1':'0';
					}
					t++;
				}
			}
		}
		l:for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(a[i][j]!=b[i][j]){
					t=-1;break l;
				}
			}
		}
		System.out.print(t);
	}
}