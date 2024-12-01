import java.util.*;
class Main{
	static int[]a;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),x,y;a=new int[N];
		for(int i=0;i<N;i++)a[i]=i;
		for(int i=0;i<M;i++){
			x=find(s.nextInt());
			y=find(s.nextInt());
			if(x!=y)a[y]=x;
			else{System.out.print(i+1);return;}
		}
		System.out.print(0);
	}
	static int find(int x){
		if(x!=a[x])a[x]=find(a[x]);
		return a[x];
	}
}