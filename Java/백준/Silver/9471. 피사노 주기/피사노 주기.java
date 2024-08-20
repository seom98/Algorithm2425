import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		while(N-->0){
			int a=1,b=1,c=0,t=s.nextInt(),m=s.nextInt(),n;
			do{n=(a+b)%m;a=b;b=n;c++;}
			while(a!=1||b!=1);
			System.out.println(t+" "+c);
		}
	}
}