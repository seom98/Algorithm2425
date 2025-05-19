import java.util.*;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int N=str.length(),c=0;
		HashSet<String>set=new HashSet<>();
		for(int i=1;i<=N;i++){
			set.clear();
			for(int j=0;j<=N-i;j++)set.add(str.substring(j,j+i));
			c+=set.size();
		}
		System.out.print(c);
	}
}