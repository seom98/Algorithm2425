import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),K=s.nextInt(),a[],b[];
		a=new int[M];
		for(int i=0;i<M;i++)a[i]=s.nextInt();
		Arrays.sort(a);
		l:while(N-->1){
			b=new int[M];
			for(int i=0;i<M;i++)b[i]=s.nextInt();
			Arrays.sort(b);
			for(int i=0;i<M;i++){
				if(a[i]>=b[i]+K){K=0;break l;}
			}
			a=b;
		}
		System.out.print(K!=0?"YES":"NO");
	}
}