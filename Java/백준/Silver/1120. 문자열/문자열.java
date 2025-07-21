import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String A=s.next(),B=s.next();
		int a=50,c;
		for(int i=0;i<=(B.length()-A.length());i++){
			c=0;
			for(int j=0;j<A.length();j++)if(A.charAt(j)!=B.charAt(j+i))c++;
			a=Math.min(a,c);
		}
		System.out.print(a);
	}
}