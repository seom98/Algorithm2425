import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt();
		PriorityQueue<Integer>gift=new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer>want=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<N;i++)gift.add(s.nextInt());
		for(int i=0;i<M;i++){
			int a=gift.poll();
			int b=s.nextInt();
			if(a-b>0)gift.add(a-b);
			else if(a-b<0){System.out.print(0);return;}
		}
		System.out.print(1);
	}
}