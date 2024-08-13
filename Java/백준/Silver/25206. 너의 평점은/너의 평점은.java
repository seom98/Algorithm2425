import java.util.*;
interface Main{
	static void main(String[]x){
		Scanner c=new Scanner(System.in);
		double N=0,S=0,T;
		while(c.hasNext()){
			c.next();T=c.nextDouble();N+=T;
			switch(c.next()){
				case"A+":S+=T*4.5;break;
				case"A0":S+=T*4.0;break;
				case"B+":S+=T*3.5;break;
				case"B0":S+=T*3.0;break;
				case"C+":S+=T*2.5;break;
				case"C0":S+=T*2.0;break;
				case"D+":S+=T*1.5;break;
				case"D0":S+=T*1.0;break;
				case"F":S+=T*0;break;
				case"P":N-=T;
			}
		}
		System.out.print(S/N);
	}
}