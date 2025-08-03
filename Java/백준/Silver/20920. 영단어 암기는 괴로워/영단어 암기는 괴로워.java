import java.io.*;
import java.util.*;
interface Main{
	static void main(String[]Z)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),i=0;
		Map<String,Integer>map=new HashMap<>();
		for(;i<n;i++){
			String s=br.readLine();
			if(s.length()<m)continue;
			map.put(s,map.getOrDefault(s,0)+1);
		}
		List<String>words=new ArrayList<>(map.keySet());
		Collections.sort(words,new Comparator<String>(){
			@Override
			public int compare(String o1,String o2){
				if(Integer.compare(map.get(o1),map.get(o2))!=0)return Integer.compare(map.get(o2),map.get(o1));
				if(o1.length()!=o2.length())return o2.length()-o1.length();
				return o1.compareTo(o2);
			}
		});
		for(String str:words)sb.append(str+"\n");
		System.out.print(sb);
	}
}