import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),d[]=new int[N],M,a;d[0]=s.nextInt();M=d[0];
		for(int i=1;i<N;i++){a=s.nextInt();M=Math.max(d[i]=Math.max(d[i-1]+a,a),M);}
		System.out.print(M);
	}
}