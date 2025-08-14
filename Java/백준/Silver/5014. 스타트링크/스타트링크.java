import java.util.*;
class Main{
	static int[]a;
	public static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int F=s.nextInt(),S=s.nextInt(),G=s.nextInt(),U=s.nextInt(),D=s.nextInt();
		a=new int[F+1];a[S]=1;
		System.out.print(BFS(F,S,G,U,D));
	}
	static String BFS(int F,int S,int G,int U,int D){
		Queue<Integer>q=new LinkedList<Integer>();
		q.add(S);
		while(!q.isEmpty()){
			int p=q.poll();
			if (p==G){
				return String.valueOf(a[p]-1);
			}
			if (p+U<=F){
				if (a[p+U]==0){
					a[p+U]=a[p]+1;
					q.add(p+U);
				}
			}
			if (p-D>0){
				if (a[p-D]==0){
					a[p-D]=a[p]+1;
					q.add(p-D);
				}
			}

		}
		return "use the stairs";
	}
}