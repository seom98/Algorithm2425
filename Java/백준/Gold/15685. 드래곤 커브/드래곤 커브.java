import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a[][]=new int[101][101],d[]=new int[1024],A=1,dy[]={1,0,-1,0},dx[]={0,-1,0,1},S=0;
		for(int i=0;i<10;i++){
			for(int j=A,k=A-1;j<A*2;j++,k--)
				d[j]=(d[k]+1)%4;
			A*=2;
		}
		while(N-->0){
			int X=s.nextInt(),Y=s.nextInt(),D=s.nextInt(),G=s.nextInt();
			a[Y][X]=1;
			for(int i=0;i<(int)Math.pow(2,G);i++)a[Y+=dx[(d[i]+D)%4]][X+=dy[(d[i]+D)%4]]=1;
		}
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				if(a[i][j]+a[i+1][j]+a[i][j+1]+a[i+1][j+1]==4)S++;
			}
		}
		System.out.print(S);
	}
}