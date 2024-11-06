import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int dr[]={0,1,0,-1},dc[]={1,0,-1,0}, // 방향
			H=s.nextInt(), // 높이
			W=s.nextInt(), // 너비
			time=0; // 시간

		char[][]map=new char[H][W]; // 맵 배열
		boolean[][]visited=new boolean[H][W]; // 지훈이가 왔던곳을 저장하는 방문배열
		Queue<int[]>queue=new LinkedList<>(), // 지훈이가 이동할수 있는 곳을 저장하는 큐
					fire=new LinkedList<>(); // 불이 번진곳을 저장하는 큐

		// 맵공간 입력받기
		for(int i=0;i<H;i++){
			String str=s.next();
			for(int j=0;j<W;j++){
				map[i][j]=str.charAt(j);
				if(map[i][j]=='J'){ // @ : 지훈이 위치
					queue.add(new int[]{i,j}); // 지훈이 위치를 큐에 저장
					map[i][j]='.'; // 빈공간과 다름없으므로 변경
				}
				else if(map[i][j]=='F') // * : 불
					fire.add(new int[]{i,j}); // 불 위치를 큐에 저장
			}
		}

		// 1초동안 일어나는 일
		l:while(true){
			time++; // 1초 추가
			int F=fire.size(), // 불의 개수
				Q=queue.size(); // 이동할 수 있는 지훈이의 위치

			// 불의 개수만큼 너비우선탐색
			while(F-->0){
				int[]f=fire.poll(); // 우선 하나의 불의 좌표를 꺼냄.

				for(int d=0;d<4;d++){ // 상하좌우방향으로 불을 이동시킬수 있는지 판단.
					int i=f[0]+dc[d], // 상하좌표이동
						j=f[1]+dr[d]; // 좌우좌표이동

					if(i>=0&&j>=0&&i<H&&j<W&&map[i][j]=='.'){ // 이동한 좌표가 맵범위를 벗어나지 않고 빈공간일 때
						fire.add(new int[]{i,j}); // 새로운 불의 위치를 큐에 저장
						map[i][j]='F'; // 불이 번진 곳에 다시 이동하지 않기 위해 변경
					}
				}
			}

			// 이동할 수 있는 지훈이의 위치 개수만큼 너비우선탐색
			while(Q-->0){
				int[]q=queue.poll(); // 지훈이의 위치 하나를 꺼냄.

				for(int d=0;d<4;d++){ // 상하좌우방향으로 상근이를 이동시킬수 있는지 판단.
					int i=q[0]+dc[d], // 상하좌표이동
						j=q[1]+dr[d]; // 좌우좌표이동

					if(i<0||j<0||i>=H||j>=W) { // 맵의 범위를 벗어난다면 탈출한 것.
						System.out.print(time);
						break l;
					}

					if(map[i][j]=='.'&&!visited[i][j]){ // 다음 좌표가 빈공간이고 방문한 적이 없는 곳일 때
						visited[i][j]=true; // 왔던 곳 저장
						queue.add(new int[]{i,j}); // 새로운 지훈이의 위치 저장
					}
				}
			}
			// 새로운 지훈이의 위치가 큐에 저장되지 않았다면 이동하지 못했다는 뜻
			if(queue.isEmpty()){ // 큐가 비어있다면
				System.out.print("IMPOSSIBLE");
				break l;
			}
		}
	}
}