import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a=s.nextInt(),b,c;
		StringBuilder sb=new StringBuilder();
		while(N-->1){
			b=s.nextInt();
			c=GDC(a,b);
			sb.append(a/c).append("/").append(b/c).append("\n");
		}
		System.out.print(sb);
	}
	static int GDC(int i,int j){
		if(j==0)return i;
		return GDC(j,i%j);
	}
}