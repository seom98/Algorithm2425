import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner c=new Scanner(System.in);
		int N=c.nextInt(),M=c.nextInt(),a[][]=new int[N+1][2],d[][]=new int[N+1][M+1],i=0;
		while(i++<N){a[i][0]=c.nextInt();a[i][1]=c.nextInt();}
		for(int j=1;j<=N;j++){
			for(int w=0;w<=M;w++)d[j][w]=a[j][0]<=w?Math.max(d[j-1][w],d[j-1][w-a[j][0]]+a[j][1]):d[j-1][w];
		}
		System.out.print(d[N][M]);
	}
}