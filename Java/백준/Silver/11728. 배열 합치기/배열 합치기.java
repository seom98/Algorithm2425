import java.io.*;
import java.util.*;
interface Main{
	static void main(String[]z)throws IOException{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(s.readLine());StringBuilder b=new StringBuilder();
		int N=Integer.parseInt(t.nextToken()),M=Integer.parseInt(t.nextToken()),a[]=new int[N+M],i;
		t=new StringTokenizer(s.readLine());
		for(i=0;i<N;i++)a[i]=Integer.parseInt(t.nextToken());
		t=new StringTokenizer(s.readLine());
		for(i=N;i<N+M;i++)a[i]=Integer.parseInt(t.nextToken());
		Arrays.sort(a);
		for(i=0;i<N+M;i++)b.append(a[i]+" ");
		System.out.print(b);
	}
}