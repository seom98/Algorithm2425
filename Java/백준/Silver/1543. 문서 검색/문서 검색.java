import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String a=s.nextLine(),b=s.nextLine();
		int C=0,i=0,x=a.length(),y=b.length();
		for(;i<=x-y;i++)if(a.substring(i,i+y).equals(b)){
			C++;i+=y-1;
		}
		System.out.print(C);
	}
}