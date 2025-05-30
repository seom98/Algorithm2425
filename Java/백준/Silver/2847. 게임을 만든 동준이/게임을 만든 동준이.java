import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),C=0,arr[]=new int[N];
		for(int i=0;i<N;i++)arr[i]=s.nextInt();
		while(N-->1){
			if(arr[N]<=arr[N-1]){
				C+=arr[N-1]-arr[N]+1;
				arr[N-1]=arr[N]-1;
			}
		}
		System.out.println(C);
	}
}