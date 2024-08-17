interface Main{
	static void main(String[]z){
		int N=new java.util.Scanner(System.in).nextInt();
		long[][]a=new long[N+1][3];a[0][2]=1;
		for(int i=0;i<N;i++){a[i+1][0]=a[i][0]-a[i][2];a[i+1][1]=a[i][1]+a[i][2];a[i+1][2]=2*a[i][0]-2*a[i][1]+a[i][2];}
		System.out.print(a[N][0]+a[N][1]+a[N][2]);
	}
}