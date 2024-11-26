import java.util.*;
class Node{
	int x;
	int y;
	double d;
	Node(int x,int y,double d){
		this.x=x;
		this.y=y;
		this.d=d;
	}
}
class Main {
	static int[] arr;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		Double[][] point=new Double[N+1][2];
		arr=new int[N+1];
		for(int i=1;i<N+1;i++){
			point[i][0]=s.nextDouble();
			point[i][1]=s.nextDouble();
			arr[i]=i;
		}
		ArrayList<Node>list=new ArrayList<>();
		for(int i=1;i<N;i++){
			for(int j=i+1;j<N+1;j++){
				//i가 첫번째점, j가 두번째 점, 둘사이 거리 로 저장
				list.add(new Node(i,j,Math.sqrt(Math.pow(point[i][0]-point[j][0],2)+Math.pow(point[i][1]-point[j][1],2))));
			}
		}

		Collections.sort(list,(a,b)->Double.compare(a.d, b.d));
		Double ans=0.0;
		int pick=0;
		for (int i=0;i<list.size();i++){
			int px=findset(list.get(i).x);
			int py=findset(list.get(i).y);
			if (px!=py){
				union(px,py);
				ans+=list.get(i).d;
				pick++;
			}
			if(pick==N-1)break;
		}
		System.out.println(ans);
	}

	static void union(int x, int y) {
		arr[y] = x;
	}

	static int findset(int x) {
		if (x != arr[x])
			arr[x] = findset(arr[x]);
		return arr[x];
	}
}