import java.util.*;
class Node{int x;int y;int d;Node(int x,int y,int d){this.x=x;this.y=y;this.d=d;}}
class Main{
	static int[] arr;
	public static void main(String[]h){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),p[][]=new int[N][4],ans=0,c=0,x,y;arr=new int[N];
		ArrayList<Node>list=new ArrayList<>();
		for(int i=0;i<N;i++){p[i][0]=s.nextInt();p[i][1]=s.nextInt();p[i][2]=s.nextInt();p[i][3]=i;arr[i]=i;}
		for(int n=0;n<3;n++){
			if(n==0)Arrays.sort(p,(a,b)->a[0]-b[0]);
			if(n==1)Arrays.sort(p,(a,b)->a[1]-b[1]);
			if(n==2)Arrays.sort(p,(a,b)->a[2]-b[2]);
			for(int i=0;i<N-1;i++)list.add(new Node(p[i][3],p[i+1][3],Math.abs(p[i][n]-p[i+1][n])));
		}
		Collections.sort(list,(a,b)->a.d-b.d);
		for(int i=0;i<list.size();i++){
			x=f(list.get(i).x);y=f(list.get(i).y);
			if(x!=y){arr[y]=x;ans+=list.get(i).d;c++;}
			if(c==N-1)break;
		}
		System.out.println(ans);
	}
	static int f(int z){if(z!=arr[z])arr[z]=f(arr[z]);return arr[z];}
}