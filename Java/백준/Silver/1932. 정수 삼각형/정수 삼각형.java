import java.util.*;
interface Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a[][]=new int[N][N],d[][]=new int[N][N],M=0;
		d[0][0]=a[0][0]=s.nextInt();
		for(int i=1;i<N;i++){
			for(int j=0;j<=i;j++){
				a[i][j]=s.nextInt();
				if(j==0)d[i][j]=d[i-1][j]+a[i][j];
				if(i==j)d[i][i]=d[i-1][i-1]+a[i][i];
			}
		}
		for(int i=1;i<N;i++)for(int j=1;j<i;j++)d[i][j]=Math.max(d[i-1][j-1],d[i-1][j])+a[i][j];
		for(int i=0;i<N;i++)if(M<d[N-1][i])M=d[N-1][i];
		System.out.print(M);
	}
}