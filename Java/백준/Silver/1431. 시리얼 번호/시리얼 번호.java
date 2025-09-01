import java.util.*;
interface Main {
	static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),i;
		List<String>list=new ArrayList<>();
		for(i=0;i<N;i++)list.add(s.next());
		list.sort(new Comparator<String>(){
			@Override
			public int compare(String o1,String o2){
				if(o1.length()!=o2.length())return o1.length()-o2.length();
				else{
					int a=0,b=0;
					for(int i=0;i<o1.length();i++){
						if(isNum(o1.charAt(i)))a+=o1.charAt(i)-48;
						if(isNum(o2.charAt(i)))b+=o2.charAt(i)-48;
					}
					if(a!=b)return a-b;
					else return o1.compareTo(o2);
				}
			}
		});
		for(String e:list)System.out.println(e);
	}
	static boolean isNum(char c){return c>=48&&c<=57;}
}