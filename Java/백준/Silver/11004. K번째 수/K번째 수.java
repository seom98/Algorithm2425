import java.util.*;
import java.io.*;
interface Main{
	static void main(String[]z)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()),K=Integer.parseInt(st.nextToken());
		List<Integer>list=new ArrayList<>();
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		System.out.print(list.get(K-1));
	}
}