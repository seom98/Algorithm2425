import java.util.*;
interface Main{
	public static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),a=0,i;
		String str=s.next();
		for(i=0;i<M;i++){
			if(str.charAt(i)=='I'){
				int p=i,c=0;
				while(p+2<M){
					if(str.charAt(p+1)=='O'&&str.charAt(p+2)=='I'){
						c++;p+=2;
						if(c==N){c--;a++;}
					}
					else break;
				}
				i=p;
			}
		}
		System.out.print(a);
	}
}