import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		HashMap<Character,Integer>map=new HashMap<>();
		char[]num=s.next().toCharArray();
		for(int j=num.length-1;j>=0;j--){
			if(!map.containsKey(num[j]))map.put(num[j],1);
			else map.put(num[j],map.get(num[j])+1);
		}
		List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.<Character,Integer>comparingByKey());
		StringBuilder sb=new StringBuilder();
		int max=9,ans=0,odd=0,len=0;char k=' ';
		for(Map.Entry<Character,Integer>e:list){
			if(e.getValue()%2==1){
				odd++;
				k=e.getKey();
				if(odd==2){
					System.out.print("I'm Sorry Hansoo");
					return;
				}
			}
			for(int i=0;i<e.getValue()-1;i+=2){
				sb.append(e.getKey());
			}
		}
		len=sb.length()-1;
		if(k!=' ')sb.append(k);
		for(int i=len;i>=0;i--){
			sb.append(sb.charAt(i));
		}
		System.out.print(sb);
	}
}