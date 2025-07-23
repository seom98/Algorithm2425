import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),c=0,l;
		long i,a=Long.MAX_VALUE;
		HashMap<Long,Integer>map=new HashMap<>();
		while(N-->0){
			i=s.nextLong();
			if(map.containsKey(i))map.put(i,map.get(i)+1);
			else map.put(i,1);
		}
		for(Map.Entry<Long,Integer>e:map.entrySet()){
			long k=e.getKey();
			int v=e.getValue();
			if(v==c){if(k<a)a=k;}
			else if(v>c){a=k;c=v;}
		}
		System.out.print(a);
	}
}