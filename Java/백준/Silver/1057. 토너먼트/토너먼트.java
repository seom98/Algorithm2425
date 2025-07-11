import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);s.nextInt();
		int A=s.nextInt(),B=s.nextInt(),C=0;
		while(A!=B){A-=A/2;B-=B/2;C++;}
		System.out.print(C);
	}
}