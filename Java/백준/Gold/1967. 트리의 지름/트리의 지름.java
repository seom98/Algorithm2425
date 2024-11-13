import java.util.*;
class Main{
	static int N,MAX=0,a[],b[],v[];
	static ArrayList<ArrayList<int[]>>list=new ArrayList<>();

	public static void main(String[]z)throws Exception{
		R s=new R();
		N=s.N()+1;a=new int[N];b=new int[N];v=new int[N];
		for(int n=0;n<N;n++)list.add(new ArrayList<>());
		for(int n=2;n<N;n++){
			int i=s.N(),j=s.N(),k=s.N();
			list.get(i).add(new int[]{j,k});
		}
		for(int n=N-1;n>0;n--){
			if(!list.get(n).isEmpty()){
				int max=0;
				for(int[] i:list.get(n)){
					if(v[i[0]]==0)C(i[0]);
					if(max<i[1]+a[i[0]]){
						max=i[1]+a[i[0]];a[n]=max;b[n]=i[0];v[n]=1;
					}
				}
			}
		}
		for(int n=1;n<N;n++){
			if(MAX/2<a[n]){
				int size=list.get(n).size(),max=0,secondMax=0;
				if(size==1)max=a[n];
				else{
					for(int[] i:list.get(n)){if(i[0]!=b[n]&&secondMax<a[i[0]]+i[1])secondMax=a[i[0]]+i[1];}
					max=a[n]+secondMax;
				}
				if(MAX<max)MAX=max;
			}
		}
		System.out.print(MAX);
	}
	static void C(int n){
		if(!list.get(n).isEmpty()){
			int max=0;
			for(int[] i:list.get(n)){
				if(v[i[0]]==0)C(i[0]);
				if(max<i[1]+a[i[0]]){
					max=i[1]+a[i[0]];a[n]=max;b[n]=i[0];v[n]=1;
				}
			}
		}
	}
}
class R{
	private final int S=1<<13;
	private byte B[] = new byte[S],c;
	private int I,s,n;
	public int N()throws Exception{n=0;while((c=r())<=32);do n=(n<<3)+(n<<1)+(c&15);while(N(c=r()));return n;}

	private boolean N(byte c){return 47<c&&c<58;}

	private byte r()throws Exception{if(I==s){s=System.in.read(B,I=0,S);if(s<0)B[0]=-1;}return B[I++];}
}