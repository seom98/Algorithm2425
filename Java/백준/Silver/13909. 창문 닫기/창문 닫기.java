import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),c=0,i=1;
		for(;i*i<=N;i++)c++;
		System.out.print(c);
	}
}