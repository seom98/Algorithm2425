import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner c=new Scanner(System.in);
		int N=c.nextInt(),M=c.nextInt(),d[]=new int[M+1];
		Arrays.fill(d, 101);
		d[0]=0;
		while(N-->0)for(int i=M,W=c.nextInt();i>=W;i--)d[i]=Math.min(d[i],d[i-W]+1);
		System.out.print(d[M]>100?-1:d[M]);
	}
}