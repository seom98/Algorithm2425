import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),p;s.nextLine();
		StringBuilder sb=new StringBuilder(s.nextLine());
		StringTokenizer t=new StringTokenizer(sb.reverse().toString());
		Deque<Integer>d=new LinkedList<>();
		for(int i=1;i<=N;i++){
			int n=Integer.parseInt(t.nextToken());
			if(n==1)d.addFirst(i);
			else if(n==2){
				p=d.removeFirst();
				d.addFirst(i);
				d.addFirst(p);
			}else d.addLast(i);
		}
		sb=new StringBuilder();
		while(d.size()!=0)sb.append(d.removeFirst()+" ");
		System.out.print(sb);
	}
}