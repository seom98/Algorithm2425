import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt()+s.nextInt();
		System.out.print((M/60+N)%24+" "+M%60);
	}
}