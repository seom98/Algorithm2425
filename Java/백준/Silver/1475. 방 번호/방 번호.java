import java.util.*;
interface Main {
	public static void main(String[] z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M[]=new int[10],max=0,K=0;
		while(N!=0){M[N%10]++;N/=10;}
		K=(M[6]+M[9]+1)/2;M[6]=M[9]=0;
		for(int i:M)max=Math.max(max,i);
		System.out.print(Math.max(max,K));
	}
}