import java.util.*;
public class Main{
	static int[] arr;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt();
		arr=new int[N];
		for(int i=0;i<N;i++)arr[i]=s.nextInt();
		for(int i=0;i<M;i++)command(s.nextInt(),s.nextInt(),s.nextInt());
		for(int i=0;i<N;i++)System.out.print(arr[i]+" ");
	}
	static void command(int a, int b, int c){
		switch(a){
			case 1:arr[b-1]=c;break;
			case 2:for(int i=b-1;i<c;i++)arr[i]=(arr[i]+1)%2;break;
			case 3:for(int i=b-1;i<c;i++)arr[i]=0;break;
			case 4:for(int i=b-1;i<c;i++)arr[i]=1;break;
		}
	}
}