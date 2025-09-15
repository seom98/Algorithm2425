import java.util.*;
interface Main{
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),P=s.nextInt(),i=0;
		List<Long>list=new ArrayList<>();
		Set<Long>set=new HashSet<>();
		list.add((long)N);
		set.add((long)N);
		while(true){
			long k=list.get(i++),t=0;
			while(k!=0){
				t+=(long)Math.pow(k%10,P);
				k/=10;
			}
			list.add(t);
			if(set.contains(t)){
				while(i-->=0){
					if(list.get(i)==t)break;
				}
				break;
			} else set.add(t);
		}
		System.out.print(i);
	}
}