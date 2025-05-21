import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),arr[][]=new int[N][2],C=0,M=0;
		for(int i=0;i<N;i++){arr[i][0]=s.nextInt();arr[i][1]=s.nextInt();}
		Arrays.sort(arr,(o1,o2)->o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1]);
		for(int i=0;i<N;i++)if(M<=arr[i][0]){M=arr[i][1];C++;}
		System.out.print(C);
	}
}