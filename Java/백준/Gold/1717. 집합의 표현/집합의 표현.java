import java.util.*;
class Main{
	static int[]a;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),c,x,y;a=new int[N+1];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=N;i++)a[i]=i;
		for(int i=0;i<M;i++){
			c=s.nextInt();
			x=s.nextInt();
			y=s.nextInt();
			if(c==0)union(x,y);
			else{sb.append(isSameParent(x,y)?"YES":"NO").append("\n");}
		}
		System.out.print(sb);
	}
	static void union(int x,int y){
		x=find(x);
		y=find(y);
		if(x!=y)a[y]=x;
	}
	static int find(int x){
		if(x!=a[x])a[x]=find(a[x]);
		return a[x];
	}
	static boolean isSameParent(int x,int y){
		x=find(x);
		y=find(y);
		if(x==y)return true;
		return false;
	}
}