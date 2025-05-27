import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt(),N,c;
		while(T-->0){
			N=s.nextInt();c=1;
			HashMap<String,Integer>map=new HashMap<>();
			while(N-->0){
				s.next();String i=s.next();
				if(map.containsKey(i))map.put(i,map.get(i)+1);
				else map.put(i,2);
			}
			for(String e:map.keySet())c*=map.get(e);
			System.out.println(c-1);
		}
	}
}