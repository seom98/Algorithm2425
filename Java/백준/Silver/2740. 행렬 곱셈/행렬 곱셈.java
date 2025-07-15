import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),a[][]=new int[N][M],i,j,k;
		for(i=0;i<N;i++)for(j=0;j<M;j++)a[i][j]=s.nextInt();s.nextInt();
		int K=s.nextInt(),b[][]=new int[M][K],c[][]=new int[N][K];
		for(i=0;i<M;i++)for(j=0;j<K;j++)b[i][j]=s.nextInt();
		for(i=0;i<N;i++){
			for(j=0;j<K;j++){
				for(k=0;k<M;k++)c[i][j]+=a[i][k]*b[k][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}