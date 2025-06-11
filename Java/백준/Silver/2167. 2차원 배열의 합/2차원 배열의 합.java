import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt()+1,M=s.nextInt()+1,a[][]=new int[N][M],Q;
		for(int i=1;i<N;i++)for(int j=1;j<M;j++)a[i][j]=s.nextInt()+a[i][j-1];
		Q=s.nextInt();
		StringBuilder sb=new StringBuilder();
		while(Q-->0){
			int i=s.nextInt(),j=s.nextInt(),x=s.nextInt(),y=s.nextInt(),S=0;
			for(int k=i;k<=x;k++)S+=a[k][y]-a[k][j-1];
			sb.append(S+"\n");
		}
		System.out.println(sb);
	}
}