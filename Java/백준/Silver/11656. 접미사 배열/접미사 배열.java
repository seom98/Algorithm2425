import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int N=str.length();
		PriorityQueue<String>queue=new PriorityQueue<>();
		for(int i=0;i<N;i++)queue.add(str.substring(i));
		StringBuilder sb=new StringBuilder();
		while(!queue.isEmpty()){sb.append(queue.poll()).append("\n");}
		System.out.print(sb);
	}
}