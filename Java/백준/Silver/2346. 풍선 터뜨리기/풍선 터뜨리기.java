import java.util.*;
interface Main{
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int N=s.nextInt();
		ArrayDeque<int[]>list=new ArrayDeque<>();
		for(int i=0; i<N;i++)list.add(new int[]{i+1,s.nextInt()});
		while(list.size()>1){
			int[]a=list.pollFirst();
			sb.append(a[0]+" ");
			int n=a[1];
			if(n>0)for(int j=1;j<n;j++)list.offerLast(list.pollFirst());
			else if(n<0)for(int j=n;j!=0;j++)list.offerFirst(list.pollLast());
		}
		sb.append(list.poll()[0]);
		System.out.print(sb);
	}
}