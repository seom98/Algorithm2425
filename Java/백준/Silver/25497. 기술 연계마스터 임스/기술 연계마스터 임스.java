import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),n=0,a=0,b=0,m=0;
		char[]c=s.next().toCharArray();
		l:while(N-->0){
			switch(c[n++]){
				case 'L':a++;break;
				case 'R':if(--a<0)break l;else m++;break;
				case 'S':b++;break;
				case 'K':if(--b<0)break l;else m++;break;
				default:m++;
			}
		}
		System.out.print(m);
	}
}