import java.util.*;
interface Main{
	public static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),A[]=new int[N],S=0,E=0,i,m,c,sum;
		for(i=0;i<N;i++){
			A[i]=s.nextInt();
			if(S<A[i])S=A[i];
			E=E+A[i];
		}
		while(S<=E){
			m=(S+E)/2;sum=0;c=0;
			for(i=0;i<N;i++){
				if(sum+A[i]>m){c++;sum=0;}
				sum=sum+A[i];
			}
			if(sum!=0)c++;
			if(c>M)S=m+1;
			else E=m-1;
		}
		System.out.print(S);
	}
}