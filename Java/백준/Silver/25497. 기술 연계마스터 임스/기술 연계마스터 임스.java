import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		s.next();int a=0,b=0,m=0;var c=s.next();
		l:for(var x:c.toCharArray())
		    if(x=='L')a++;
			else if(x=='R'){if(--a<0)break l;m++;}
			else if(x=='S')b++;
			else if(x=='K'){if(--b<0)break l;m++;}
			else m++;
		System.out.print(m);
	}
}