import java.io.*;
import java.util.*;
interface Main{
	static void main(String[]z)throws Exception{
		BufferedReader S=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer T=new StringTokenizer(S.readLine());
		int N=Integer.parseInt(T.nextToken()),M=Integer.parseInt(T.nextToken()),a[]=new int[N],i,j,r=0,s;
		T=new StringTokenizer(S.readLine());
		for(i=0;i<N;)a[i++]=Integer.parseInt(T.nextToken());
		for(i=0;i<N;i++){
			s=a[i];
			if(s==M){r++;continue;}
			for(j=i+1;j<N;j++){s+=a[j];
				if(s==M){r++;break;}
				else if(s>M)break;
			}
		}
		System.out.print(r);
	}
}