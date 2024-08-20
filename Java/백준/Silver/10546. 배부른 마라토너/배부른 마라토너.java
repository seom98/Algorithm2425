import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=n;Map<String,Integer> m=new HashMap();String k;
		while(i-->0){k=s.next();if(m.get(k)==null)m.put(k,1);else m.put(k,m.get(k)+1);}
		while(++i<n-1){k=s.next();m.put(k,m.get(k)-1);}
		for(String a:m.keySet()){if(m.get(a)>0)System.out.print(a);}
	}
}