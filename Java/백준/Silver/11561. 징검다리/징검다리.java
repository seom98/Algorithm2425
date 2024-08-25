import java.io.*;
import java.util.*;
interface Main{
	public static void main(String[]z)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		while(T-->0){
			long N=Long.parseLong(br.readLine());
			sb.append((int)Math.floor((-1+Math.sqrt(1+8*N))/2)).append("\n");
		}
		System.out.print(sb);
	}
}