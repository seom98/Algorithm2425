import java.util.*;
interface Main{
	static List<Long> s=new ArrayList<>();
	public static void main(String[]z){
		int N=new Scanner(System.in).nextInt(),I=10;
		while(I-->0)c(I,1);
		Collections.sort(s);
		System.out.print(N>1022?-1:s.get(N));
	}
	static void c(long i,int j){
		if(j>10)return;
		s.add(i);
		for(int x=0;x<i%10;x++)c(i*10+x,j+1);
	}
}