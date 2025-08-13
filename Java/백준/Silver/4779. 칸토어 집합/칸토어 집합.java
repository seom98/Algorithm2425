import java.util.*;
class Main{
	static StringBuilder k;
	public static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			int N=s.nextInt();
			k=new StringBuilder();
			for(int i=0;i<(int)Math.pow(3,N);i++)k.append("-");
			ZG(0,(int)Math.pow(3,N));
			System.out.println(k);
		}
	}
	static void ZG(int I,int L){
		if(L==1)return;
		int start=L/3+I,end=L/3*2+I;
		for(int i=start;i<end;i++)k.setCharAt(i,' ');
		ZG(I,L/3);
		ZG(end,L/3);
	}
}