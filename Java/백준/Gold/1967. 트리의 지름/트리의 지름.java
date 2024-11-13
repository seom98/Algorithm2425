import java.util.*;
class Main{
	static int N,MAX=0,a[],b[],v[];
	static ArrayList<ArrayList<int[]>>list=new ArrayList<>();

	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		N=s.nextInt()+1;
		a=new int[N]; // 각 노드에서 자식노드로 가는 최대길이
		b=new int[N]; // 각 노드에서 제일 긴 길이를 가지고 있는 자식노드 번호
		v=new int[N];

		for(int n=0;n<N;n++)list.add(new ArrayList<>());
		for(int n=2;n<N;n++){
			// i : 부모노드, j : 자식노드, k: 두 노드간의 거리
			int i=s.nextInt(),j=s.nextInt(),k= s.nextInt();
			list.get(i).add(new int[]{j,k});
		}


		// 리프노드부터 최대길이 저장해주기
		for(int n=N-1;n>0;n--){
			// 자식노드가 있을 경우만 탐색
			if(!list.get(n).isEmpty()){
				int max=0; // 자식노드로 가는 최대길이
				for(int[] i:list.get(n)){
					// 자신과 자식사이의 거리 + 자식노드의 최대길이값이 젤 큰게 max
					if(v[i[0]]==0){
						C(i[0]);
					}
					if(max<i[1]+a[i[0]]){
						max=i[1]+a[i[0]]; // max 업데이트
						a[n]=max; // n번째 노드에서 자식노드로 가는 최대길이 업데이트
						b[n]=i[0]; // 최대길이를 담당하는 자식노드 번호 업데이트
						v[n]=1;
					}
				}
			}
//			System.out.println(n + " " + a[n] + " " + b[n] + " " + MAX);
		}

		// 루트 노드부터 지름의 최대값 탐색
		for(int n=1;n<N;n++){

			// 현재의 지름의 최대값보다 그 아래뎁스로 이루어진 노드의 길이가 더 길다고 판단되었을 때
			if(MAX/2<a[n]){
				int size=list.get(n).size();
				int max=0;
				if(size==1)max=a[n];
				else if(size==0)continue;
				else {
					int secondMax=0;
					for(int[] i:list.get(n)){
						if(i[0]!=b[n]&&secondMax<a[i[0]]+i[1])secondMax=a[i[0]]+i[1];
					}
					max=a[n]+secondMax;
				}
				if(MAX<max)MAX=max;
			}
		}
		System.out.print(MAX);
	}
	static void C(int n){
		if(!list.get(n).isEmpty()){
			int max=0; // 자식노드로 가는 최대길이
			for(int[] i:list.get(n)){
				// 자신과 자식사이의 거리 + 자식노드의 최대길이값이 젤 큰게 max
				if(v[i[0]]==0){
					C(i[0]);
				}
				if(max<i[1]+a[i[0]]){
					max=i[1]+a[i[0]]; // max 업데이트
					a[n]=max; // n번째 노드에서 자식노드로 가는 최대길이 업데이트
					b[n]=i[0]; // 최대길이를 담당하는 자식노드 번호 업데이트
					v[n]=1;
				}
			}
		}
	}
}