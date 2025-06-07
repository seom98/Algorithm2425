import java.io.*;
import java.util.*;
class Main{
	static int A[]={0,0,0},a[][],N;
	public static void main(String[]z)throws IOException{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(s.readLine());a=new int[N][N];
		for(int i=0;i<N;i++){
			StringTokenizer t=new StringTokenizer(s.readLine());
			for(int j=0;j<N;j++)a[i][j]=Integer.parseInt(t.nextToken());
		}
		Recursion(N,0,0);
		System.out.print(A[0]+"\n"+A[1]+"\n"+A[2]);
	}
	static void Recursion(int n,int s1,int s2){
		int s=a[s1][s2];boolean flag=false;
		l:for(int i=s1;i<s1+n;i++)for(int j=s2;j<s2+n;j++)if(a[i][j]!=s){flag=true;break l;}
		if(flag)for(int i=s1;i<s1+n;i+=n/3)for(int j=s2;j<s2+n;j+=n/3)Recursion(n/3,i,j);
		else A[s+1]++;
	}
}