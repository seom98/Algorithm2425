import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a[]=new int[N],k=(int)Math.round(N*0.15),S=0,n=N,i;
		while(N-->0)a[N]=s.nextInt();
		Arrays.sort(a);
		for(i=k;i<n-k;i++)S+=a[i];
		System.out.print(Math.round((double)S/(n-2*k)));
	}
}