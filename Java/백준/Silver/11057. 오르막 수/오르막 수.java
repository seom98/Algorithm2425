interface Main{
	static void main(String[]z){
		int N=new java.util.Scanner(System.in).nextInt(),d[][]=new int[N+1][10],m=10007,i,j,k,S=0;
		for(i=0;i<=9;i++)d[1][i]=1;
		for(i=2;i<=N;i++)for(j=0;j<=9;j++)for(k=j;k<=9;k++)d[i][j]+=d[i-1][k]%m;
		for(i=0;i<=9;i++,S%=m)S+=d[N][i];
		System.out.print(S);
	}
}