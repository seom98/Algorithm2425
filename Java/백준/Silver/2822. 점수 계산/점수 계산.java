import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int a[][]=new int[8][2],i=0,S=0;
		for(;i<8;){S+=a[i][0]=s.nextInt();a[i][1]=i++;}
		Arrays.sort(a,(x,y)->x[0]-y[0]);
		for(i=0;i<3;a[i++][0]=0)S-=a[i][0];
		System.out.println(S);
		Arrays.sort(a,(x,y)->x[1]-y[1]);
		for(int[]b:a)if(b[0]!=0)System.out.print(b[1]+1+" ");
	}
}