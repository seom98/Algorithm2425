import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),arr[][]=new int[N][2];
		for(int i=0;i<N;i++){arr[i][0]=s.nextInt();arr[i][1]=s.nextInt();}
		Arrays.sort(arr,(o1,o2)->o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]);
		PriorityQueue<Integer>queue=new PriorityQueue<>();queue.add(arr[0][1]);
		for(int i=1;i<N;i++){
			if(queue.peek()<=arr[i][0])queue.poll();
			queue.add(arr[i][1]);
		}
		System.out.print(queue.size());
	}
}