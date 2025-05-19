import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt(),C;
		StringBuilder sb=new StringBuilder();
		for(int t=0;t<T;t++){
			C=s.nextInt();
			sb.append(C/25).append(" ");
			C=C%25;
			sb.append(C/10).append(" ");
			C=C%10;
			sb.append(C/5).append(" ");
			C=C%5;
			sb.append(C).append("\n");
		}
		System.out.println(sb);
	}
}