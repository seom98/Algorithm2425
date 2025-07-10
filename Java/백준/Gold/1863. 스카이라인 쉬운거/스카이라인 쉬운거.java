import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),C=0,i;
		Stack<Integer>stack=new Stack<>();
		while(N-->0){
			s.nextInt();
			i=s.nextInt();
			while(!stack.isEmpty()&&stack.peek()>i){
				stack.pop();
				C++;
			}
			if(stack.isEmpty()||stack.peek()!=i)stack.push(i);
		}
		while(!stack.isEmpty())C+=stack.pop()==0?0:1;
		System.out.print(C);
	}
}