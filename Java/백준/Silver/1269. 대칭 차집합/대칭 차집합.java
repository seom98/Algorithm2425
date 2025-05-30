import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),C=N;
		HashSet<Integer>set=new HashSet<>();
		while(N-->0)set.add(s.nextInt());
		while(M-->0){
			int n=s.nextInt();
			if(set.contains(n))C--;
			else C++;
		}
		System.out.print(C);
	}
}