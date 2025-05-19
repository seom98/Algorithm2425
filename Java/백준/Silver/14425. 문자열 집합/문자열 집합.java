import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),c=0;
		HashSet<String>set=new HashSet<>();
		for(int i=0;i<N;i++)set.add(s.next());
		for(int i=0;i<M;i++)if(set.contains(s.next()))c++;
		System.out.print(c);
	}
}