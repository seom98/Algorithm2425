import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashMap<String,Integer>m=new HashMap<>();
		for(int i=0;i<n;i++){
			String a=s.next();s.next();
			if(m.containsKey(a))m.remove(a);
			else m.put(a,0);
		}
		List<String>l=new ArrayList<>(m.keySet());
		Collections.sort(l,Collections.reverseOrder());
		StringBuilder sb=new StringBuilder();
		for(String i:l)sb.append(i+"\n");
		System.out.print(sb);
	}
}