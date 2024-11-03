import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int H=s.nextInt(),W=s.nextInt(),S=0,a,HW,A[][],M=0;
		A=new int[H+1][W+1];
		for(int w=1;w<=W;w++){
			a=s.nextInt();
			for(int i=1;i<=a;i++)A[i][w]=1;
			S+=a;
			M=a>M?a:M;
		}
		HW=M*W;
		for(int h=H;h>=0;h--){
			for(int l=1;l<=W;l++){if(A[h][l]==1){HW-=l-1;break;}}
			for(int r=W;r>0;r--){if(A[h][r]==1){HW-=W-r;break;}}
		}
		System.out.print(HW-S);
	}
}