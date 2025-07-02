import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),K=s.nextInt(),a[][]=new int[N][4],i,j,k=0;
		while(N-->0)for(i=0;i<4;i++)a[N][i]=s.nextInt();
		Arrays.sort(a,(x,y)->x[1]==y[1]?x[2]==y[2]?x[3]==y[3]?y[0]-x[0]:y[3]-x[3]:y[2]-x[2]:y[1]-x[1]);
		for(i=0;i<a.length;i++)if(a[i][0]==K){
			for(j=i;j>=0;j--)if(a[i][1]==a[j][1]&&a[i][2]==a[j][2]&&a[i][3]==a[j][3])k=j;
			System.out.print(k+1);break;
		}
	}
}