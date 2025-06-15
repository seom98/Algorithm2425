import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a[]=new int[N],X=0,Y=N-1,Z,C=0,x;
		while(N-->0)a[N]=s.nextInt();Arrays.sort(a);Z=s.nextInt();
		while(X<Y){x=a[X]+a[Y];if(x<Z)X++;else if(x>Z)Y--;else{X++;Y--;C++;}}
		System.out.print(C);
	}
}