import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),C=1,i=0,j,k=Math.min(N,M)+1,a[][]=new int[N][M];
		for(;i<N;i++){
			String S=s.next();
			for(j=0;j<M;j++)a[i][j]=S.charAt(j)-48;
		}
		L:while(k-->1){
			for(i=0;i<N-k;i++){
				for(j=0;j<M-k;j++){
					if(a[i][j]==a[i+k][j]&&a[i][j]==a[i][j+k]&&a[i][j]==a[i+k][j+k]){C=(k+1)*(k+1);break L;}
				}
			}
		}
		System.out.print(C);
	}
}