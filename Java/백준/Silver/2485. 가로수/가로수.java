import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),c=0,i=1,a[]=new int[N];a[0]=s.nextInt();
		for(;i<N;i++){
			a[i]=s.nextInt();
			c=GDC(a[i]-a[i-1],c);
		}
		System.out.print((a[N-1]-a[0])/c-(N-1));
	}
	static int GDC(int i,int j){
		if(j==0)return i;
		return GDC(j,i%j);
	}
}