import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		while(N-->0){
			long i=s.nextLong();
			while(!isP(i))i++;
			System.out.println(i);
		}
	}
	static boolean isP(long p){
		if(p<2)return false;
		for(int i=2;i<=Math.sqrt(p);i++)if(p%i==0)return false;
		return true;
	}
}