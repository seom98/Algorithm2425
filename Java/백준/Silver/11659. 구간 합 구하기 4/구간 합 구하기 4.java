import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt()+1,M=s.nextInt(),a[]=new int[N];
		for(int i=1;i<N;i++)a[i]=s.nextInt()+a[i-1];
		StringBuilder b=new StringBuilder();
		while(M-->0)b.append(-1*(a[s.nextInt()-1]-a[s.nextInt()])+"\n");
		System.out.print(b);
	}
}