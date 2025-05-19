import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),max=0;
		int[]rope=new int[N];
		for(int i=0;i<N;i++)rope[i]=s.nextInt();
		Arrays.sort(rope);
		for(int i=0;i<N;i++)if(rope[i]*(N-i)>max)max=rope[i]*(N-i);
		System.out.print(max);
	}
}