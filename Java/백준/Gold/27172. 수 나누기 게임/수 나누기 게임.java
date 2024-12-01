import java.util.*;
import java.io.*;
public class Main {
	public static int p[],a[],num[],N,max=0;
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		N=Integer.parseInt(br.readLine());p=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++){
			p[i]=Integer.parseInt(st.nextToken());
			max=p[i]>max?p[i]:max;
		}
		num=new int[max+1];a=new int[N+1];
		for(int i=0;i<N;i++)num[p[i]]=i+1;
		for(int m:p)for(int i=m*2;i<=max;i+=m)if(num[i]!=0){a[num[i]]--;a[num[m]]++;}
		for(int i=1;i<=N;i++)sb.append(a[i]+" ");
		System.out.print(sb);
	}
}