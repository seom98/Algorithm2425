import java.util.*;
interface Main{
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),L=s.nextInt(),a[]=new int[N],i,t=1,k;
		for(i=0;i<N;i++)a[i]=s.nextInt();
		Arrays.sort(a);
		k=a[0];
		for(i=1;i<N;i++){
			if(a[i]-k<L)continue;
			else {t++;k=a[i];}
		}
		System.out.print(t);
	}
}