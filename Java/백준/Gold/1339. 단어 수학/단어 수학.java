import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<N;i++){
			char[]num=s.next().toCharArray();
			for(int j=num.length-1,k=1;j>=0;j--,k*=10){
				if(!map.containsKey(num[j]))map.put(num[j],k);
				else map.put(num[j],map.get(num[j])+k);
			}
		}
		List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.<Character,Integer>comparingByValue().reversed());
		int max=9,ans=0;
		for(Map.Entry<Character,Integer>e:list)ans+=max--*e.getValue();
		System.out.print(ans);
	}
}