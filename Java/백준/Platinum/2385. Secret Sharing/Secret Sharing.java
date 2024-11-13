import java.util.*;
class Main{
	static String t="";
	static Comparator<String>C1=(i,j)->(i+j).compareTo(j+i),C2=(i,j)->(i+t+j).compareTo(j+t+i);
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		String[]str=new String[N];
		for(int i=0;i<N;i++)str[i]=s.next();
		Arrays.sort(str,0,N,C1);
		int i;
		for(i=0;i<N&&str[i].charAt(0)=='0';i++)t+=str[i];
		if(i==N) System.out.print("INVALID");
		else {
			int p=i;
			for(int j=i+1;j<N;j++){
				if(C2.compare(str[j],str[p])<0)p=j;
			}
			System.out.print(str[p]);
			for(int j=0;j<N;j++){
				if(j!=p) System.out.print(str[j]);
			}
		}
	}
}