import java.util.*;
class Node{int x;int y;double d;Node(int x,int y,double d){this.x=x;this.y=y;this.d=d;}}
class Main{
	static int[] arr;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),pick=0,px,py;arr=new int[N+1];
		Double point[][]=new Double[N+1][2],ans=0.0;ArrayList<Node>list=new ArrayList<>();
		for(int i=1;i<N+1;i++){point[i][0]=s.nextDouble();point[i][1]=s.nextDouble();arr[i]=i;}
		for(int i=1;i<N;i++){for(int j=i+1;j<N+1;j++)list.add(new Node(i,j,Math.sqrt(Math.pow(point[i][0]-point[j][0],2)+Math.pow(point[i][1]-point[j][1],2))));}
		Collections.sort(list,(a,b)->Double.compare(a.d, b.d));
		for(int i=0;i<list.size();i++){
			px=f(list.get(i).x);py=f(list.get(i).y);
			if(px!=py){arr[py]=px;ans+=list.get(i).d;pick++;}
			if(pick==N-1)break;
		}
		System.out.println(ans);
	}
	static int f(int x){if(x!=arr[x])arr[x]=f(arr[x]);return arr[x];}
}