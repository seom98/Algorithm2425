import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),Z=0,P1=0,M1=0,ans=0;
		PriorityQueue<Integer>P=new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer>M=new PriorityQueue<>();
		while(N-->0){
			int n=s.nextInt();
			if(n<-1)M.add(n);
			else if(n>1)P.add(n);
			else{
				switch(n){
					case 1:P1++;break;
					case -1:M1++;break;
					case 0:Z++;break;
				}
			}
		}
		while(P.size()>=2){
			ans+=P.poll()*P.poll();
		}
		if(!P.isEmpty())ans+=P.poll();
		while(M.size()>=2){
			ans+=M.poll()*M.poll();
		}
		if(!M.isEmpty()){
			if(M1>0){ans+=M.poll()*-1;M1--;}
			else if(Z>0)Z--;
			else if(M1==0&&Z==0){ans+=M.poll();}
		}
		ans+=P1;
		ans+=M1/2;
		if(M1%2==1)M1=1;
		if(Z==0&&M1==1)ans-=1;
		System.out.print(ans);
	}
}