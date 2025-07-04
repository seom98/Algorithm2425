import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),c=0;
		HashSet<String>set=new HashSet<>();
		while(N-->0){
			String S=s.next();
			if(S.equals("ENTER")){c+=set.size();set.clear();}
			else set.add(S);
		}
		c+=set.size();
		System.out.print(c);
	}
}