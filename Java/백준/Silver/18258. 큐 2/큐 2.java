import java.io.*;
import java.util.*;
interface Main{
	static void main(String[]z)throws IOException{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(s.readLine()),n=0;StringBuilder b=new StringBuilder();Queue<Integer>q=new LinkedList<>();
		while(N-->0){
			StringTokenizer t=new StringTokenizer(s.readLine());
			switch(t.nextToken().charAt(1)){
				case'u':n=Integer.parseInt(t.nextToken());q.add(n);break;
				case'o':b.append(q.isEmpty()?"-1\n":q.poll()+"\n");break;
				case'i':b.append(q.size()+"\n");break;
				case'm':b.append(q.isEmpty()?"1\n":"0\n");break;
				case'a':b.append(q.isEmpty()?"-1\n":n+"\n");break;
				case'r':b.append(q.isEmpty()?"-1\n":q.peek()+"\n");break;
			}
		}
		System.out.print(b);
	}
}