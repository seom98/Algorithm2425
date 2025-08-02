import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a=0,i=1;
		Stack<Integer>stack=new Stack<>();
		while(N-->0){
			int n=s.nextInt();
			if(i==n)i++;
			else{
				while(!stack.isEmpty()){
					if(stack.peek()==i){stack.pop();i++;}
					else break;
				}
				stack.push(n);
			}
		}
		while(!stack.isEmpty()){
			if(stack.peek()==i){stack.pop();i++;}
			else{a++;break;}
		}
		System.out.print(a==0?"Nice":"Sad");
	}
}