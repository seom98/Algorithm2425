import java.util.*;
interface Main{
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		long x=s.nextInt(),y=s.nextInt();
		int t=(int)((y*100)/x),l=0,r=1000000000,a=-1;
		if(t>98){System.out.print(-1);return;}
		while(l<=r){
			int m=(l+r)/2;
			int z=(int)(((y+m)*100)/(x+m));
			if(t>=z){a=m+1;l=m+1;}
			else r=m-1;
		}
		System.out.print(a);
	}
}