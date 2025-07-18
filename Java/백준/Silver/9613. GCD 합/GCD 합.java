import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0){
			int N=s.nextInt(),a[]=new int[N],n=N,i,j;
			long C=0;
			while(N-->0)a[N]=s.nextInt();
			Arrays.sort(a);
			for(i=1;i<n;i++)for(j=0;j<i;j++)C+=GCD(a[i],a[j]);
			System.out.println(C);
		}
	}
	static int GCD(int j,int k){
		if(j%k==0)return k;
		return GCD(k,j%k);
	}
}