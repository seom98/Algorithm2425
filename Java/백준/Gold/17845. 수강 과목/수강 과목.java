import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner c=new Scanner(System.in);
		int M=c.nextInt(),N=c.nextInt(),d[]=new int[M+1];
		while(N-->0)for(int i=M,C=c.nextInt(),W=c.nextInt();i>=W;i--)d[i]=Math.max(d[i],d[i-W]+C);
		System.out.print(d[M]);
	}
}