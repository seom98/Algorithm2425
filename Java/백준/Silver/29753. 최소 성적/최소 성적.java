import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner c=new Scanner(System.in);
		int N=c.nextInt(),M,a,s=0,n=0,x=9;
		StringTokenizer t=new StringTokenizer(c.next(), ".");
		M=Integer.parseInt(t.nextToken())*100+Integer.parseInt(t.nextToken());
		String[]g={"F","D0","D+","C0","C+","B0","B+","A0","A+","impossible"};
		for(int i=1;i<N;i++){
			a=c.nextInt();char[]v=c.next().toCharArray();
			s+=("FDCBA".indexOf(v[0])*100+(v.length==2&&v[1]=='+'?50:0))*a;
			n+=a;
		}
		a=c.nextInt();
		for(int i=0;i<=450;i+=i<1?100:50){
			if((s+i*a)/(n+a)>M){
				x=i<1?i:i/50-1;
				break;
			}
		}
		System.out.print(g[x]);
	}
}