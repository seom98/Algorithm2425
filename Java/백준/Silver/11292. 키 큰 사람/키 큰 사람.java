import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N,M=0,ki[];String[] name;
		StringBuilder sb=new StringBuilder();
		while(true){
			N=s.nextInt();
			if(N==0)break;
			M=0;ki=new int[N];name=new String[N];
			for(int i=0;i<N;i++){
				name[i]=s.next();
				ki[i]=(int)(s.nextDouble()*100);
				if(ki[i]>M)M=ki[i];
			}
			for(int i=0;i<N;i++){if (ki[i] == M) sb.append(name[i] + " ");}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}