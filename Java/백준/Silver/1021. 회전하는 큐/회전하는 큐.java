import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),C=0,i,c;
		Deque<Integer>d=new LinkedList<>();
		for(i=1;i<=N;i++)d.addFirst(i);
		while(M-->0){
			i=s.nextInt();c=0;
			while(true){
				c++;
				int p=d.pollFirst();
				if(p==i){
					int m=Math.min(c,N-c);
					C+=m;
					break;
				}
				else {
					d.addLast(p);
				}
			}
			N--;
		}
		System.out.print(C);
	}
}