import java.util.*;
interface Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),a[]=new int[M+1];
		while(N-->0)a[s.nextInt()]++;
		Arrays.sort(a);
		System.out.print(a[M]);
	}
}