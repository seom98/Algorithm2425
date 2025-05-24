import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),max=0;
		HashMap<String, Integer>map=new HashMap<>();
		while(N-->0){
			String k=s.next();
			if(map.containsKey(k))map.put(k, map.get(k)+1);
			else map.put(k,1);
		}
		List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.<String,Integer>comparingByKey().reversed());
		String ans="";
		for(Map.Entry<String,Integer>e:list){
			if(max<=e.getValue()){ans=e.getKey();max=e.getValue();}
		}
		System.out.print(ans);
	}
}