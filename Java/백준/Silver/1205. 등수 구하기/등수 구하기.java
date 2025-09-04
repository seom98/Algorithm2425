import java.util.*;
interface Main {
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),P=s.nextInt(),i,R=1;
		Integer[]arr=new Integer[N];
		for(i=0;i<N;i++)arr[i]=s.nextInt();
		Arrays.sort(arr,(a1,a2)->a2-a1);
		if(N==P&&M<=arr[N-1])System.out.print(-1);
		else{
			for(i=0;i<N;i++){
				if(M<arr[i])R++;
				else break;
			}
			System.out.print(R);
		}
	}
}