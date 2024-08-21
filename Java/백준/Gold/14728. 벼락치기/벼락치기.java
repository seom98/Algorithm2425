import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner c=new Scanner(System.in);
		int N=c.nextInt(),M=c.nextInt(),d[]=new int[M+1];
		while(N-->0)for(int i=M,w=c.nextInt(),v=c.nextInt();i>=w;i--)d[i]=Math.max(d[i],d[i-w]+v);
		System.out.print(d[M]);
	}
}