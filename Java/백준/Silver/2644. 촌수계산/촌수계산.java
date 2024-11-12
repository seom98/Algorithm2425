import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(), // 총 몇명인지
			// P1과 P2사이의 촌수를 구해보아요.!
			// 1부터 시작하는거 싫어서 0부터 시작하기로해요..!
			P1=s.nextInt()-1,P2=s.nextInt()-1,
			M=s.nextInt(), // 간선의 개수!
			chon=-1; // 몇촌인지 답을 낼 곳이에요.
		// 방문배열을 만들어야겠죠?
		boolean[]visited=new boolean[N];
		// 트리가 저장되는 곳이에요!
		ArrayList<ArrayList<Integer>>list=new ArrayList<>();
		while(N-->0)list.add(new ArrayList<>());
		// 트리에 관계를 저장해요!!
		while(M-->0){
			int i=s.nextInt()-1,j=s.nextInt()-1;
			list.get(i).add(j);
			list.get(j).add(i);
		}
		// 너비우선 탐색을 위해 큐를 만들어요!
		Queue<int[]>q=new LinkedList<>();
		q.add(new int[]{P1,0}); // P1부터 시작하고 P2까지 도달하는것을 목표로 해봐요!!
		visited[P1]=true; // P1은 자기자신이니 방문처리해주도록 해요!
		// 큐가 빌때까지 너비우선탐색을 해볼게용
		w:while(!q.isEmpty()){
			int[] now= q.poll(); // 우선 한사람을 꺼내요
			for(int i:list.get(now[0])){ // 그사람과 연결된 사람들을 봐요.!
				if(i==P2){
					chon=now[1]+1; // 몇촌인지 알아냈으니 와일문을 끝내요!
					break w;
				}
				if(!visited[i]){ // 방문한 적이 없을 때만 처리해주도록 해요!!
					visited[i]=true;
					q.add(new int[]{i,now[1]+1});
				}
			}
		}
		System.out.print(chon);
	}
}