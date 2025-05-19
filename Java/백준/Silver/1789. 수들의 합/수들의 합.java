import java.util.*;
interface Main{
	static void main(String[]z){
		long N=new java.util.Scanner(System.in).nextLong(),n=1;
		while(N>0){N-=n;if(N>=0)n++;}
		System.out.print(n-1);
	}
}