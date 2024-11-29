import java.util.*;
interface Main{
	static void main(String[]z){
		int M=new Scanner(System.in).nextInt(),S=0,E=0,T=0,A=0;
		List<Integer>list=new ArrayList<>();
		for(int i=2;i<=M+1000;i++)if(P(i))list.add(i);
		int N=list.size();
		while(true){
			T=T<M?T+list.get(E++):T-list.get(S++);
			if(T==M)A++;
			if(list.get(S)>=M)break;
		}
		System.out.print(A);
	}
	static boolean P(int n){
		for(int i=2;i<=Math.sqrt(n);i++)if(n%i==0)return false;
		return true;
	}
}