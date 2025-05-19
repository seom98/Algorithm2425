import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int N=str.length(),cnt=0,sum=0;
		PriorityQueue<Character>queue=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<N;i++){
			char c=str.charAt(i);
			if(c!='0')cnt++;
			sum+=c;
			queue.add(c);
		}
		if(cnt==N||sum%3!=0){
			System.out.print(-1);
			return;
		}
		StringBuilder sb=new StringBuilder();
		while(!queue.isEmpty()){sb.append(queue.poll());}
		System.out.print(sb);
	}
}