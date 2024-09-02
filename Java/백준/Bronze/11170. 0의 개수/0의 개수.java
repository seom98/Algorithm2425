import java.util.*;
interface Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt(),N,M,C;
		while(T-->0){
			N=s.nextInt();M=s.nextInt();C=0;
			for(int i=N;i<=M;i++){
				String a=Integer.toString(i);
				for(int j=0;j<a.length();j++){
					if(a.charAt(j)=='0')C++;
				}
			}
			System.out.println(C);
		}
	}
}