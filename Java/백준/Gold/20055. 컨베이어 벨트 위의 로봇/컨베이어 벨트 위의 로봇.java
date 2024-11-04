import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int round=0,N=s.nextInt(),K=s.nextInt(),a[]=new int[2*N],R=0,start=0,end=0,stop=0,B=2*N,P,r;
		Queue<Integer>q=new LinkedList<>();
		for(int i=0;i<2*N;i++)a[i]=s.nextInt();
		while(K>0){
			round++;
			start=(B+start-1)%B;end=(N+start-1)%B;
			R=q.size();
			stop=end+1;
			for(int i=0;i<R;i++){
				r=q.poll();if(r==end)continue;P=(B+r+1)%B;
				if(P==stop||a[P]==0){
					stop=r;
					q.add(r);
				}else{
					if(--a[P]==0)K--;
					if(P!=end){q.add(P);stop=P;}
				}
			}
			if(a[start]!=0&&stop!=start){
				q.add(start);
				if(a[start]==1)K--;
				a[start]--;
			}
		}
		System.out.print(round);
	}
}