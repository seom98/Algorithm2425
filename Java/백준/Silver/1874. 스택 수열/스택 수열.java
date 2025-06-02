import java.util.*;
import java.io.*;
interface Main{
	static void main(String[]z)throws IOException{
		StringBuilder sb=new StringBuilder();Stack<Integer>a=new Stack<>(),b=new Stack<>();
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(r.readLine()),m=0;
		for(int i=N;i>0;i--)b.push(i);
		while(N-->0){
			int n=Integer.parseInt(r.readLine());
			if(m<=n){
				while(m<n){
					if(b.isEmpty()){System.out.print("NO");return;}
					a.push(b.pop());
					sb.append("+\n");
					m++;
				}
				a.pop();sb.append("-\n");
			}
			else if(a.peek()==n){a.pop();sb.append("-\n");}
			else {System.out.print("NO");return;}
		}
		System.out.print(sb);
	}
}