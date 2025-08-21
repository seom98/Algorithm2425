import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		boolean[]p=new boolean[1000001];
		p[0]=p[1]=true;
		for(int i=2;i<=(int)Math.sqrt(1000000);i++){
			for(int j=2;i*j<1000001;j++)p[i*j]=true;
		}
		while(t-->0){
			int n=s.nextInt(),i,a=0;
			for(i=2;i<=n/2;i++)if(!p[i]&&!p[n-i])a++;
			System.out.println(a);
		}
	}
}