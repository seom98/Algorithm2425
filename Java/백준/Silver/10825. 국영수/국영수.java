import java.util.*;
interface Main{
	static class P{
		String a;int k;int e;int m;
		public P(String a,int k,int e,int m){
			this.a=a;this.k=k;this.e=e;this.m=m;
		}
	}
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();List<P>l=new ArrayList<>();
		while(N-->0)l.add(new P(s.next(),s.nextInt(),s.nextInt(),s.nextInt()));
		Collections.sort(l,(x,y)->x.k==y.k?x.e==y.e?x.m==y.m?x.a.compareTo(y.a):y.m-x.m:x.e-y.e:y.k-x.k);
		StringBuilder b=new StringBuilder();
		for(P p:l)b.append(p.a+"\n");
		System.out.print(b);
	}
}