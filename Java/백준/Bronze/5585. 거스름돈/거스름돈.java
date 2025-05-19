import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int C=1000-s.nextInt(),S=0;
		int[]coin={500, 100, 50, 10, 5, 1};
		for(int c:coin){S+=C/c;C%=c;}
		System.out.print(S);
	}
}