import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),p=sc.next();
		int a=s.length(),b=p.length();
		Stack<Character>stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a;i++){
			int c=0;
			stack.push(s.charAt(i));
			if(stack.size()>=b){
				for(int j=0;j<b;j++){
					if(stack.get(stack.size()-b+j)==p.charAt(j))c++;
					if(c==b)for(int k=0;k<b;k++)stack.pop();
				}
			}
		}
		if(stack.isEmpty())System.out.print("FRULA");
		else for(char c:stack)sb.append(c);
		System.out.print(sb);
	}
}