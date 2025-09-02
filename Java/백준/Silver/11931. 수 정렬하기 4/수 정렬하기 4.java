import java.util.*;
import java.io.*;
interface Main {
	static void main(String[]Z)throws IOException{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(s.readLine());
		List<Integer>list=new ArrayList<>();
		while(N-->0)list.add(Integer.parseInt(s.readLine()));
		list.sort(Collections.reverseOrder());
		StringBuilder b=new StringBuilder();
		for(Integer e:list)b.append(e).append("\n");
		System.out.print(b);
    }
}