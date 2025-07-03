import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),i;StringBuilder sb=new StringBuilder();
		Stack<Integer>S=new Stack<>();
		while(N-->0){
			i=s.nextInt();
			if(i==1)S.push(s.nextInt());
			else{
				switch(i){
					case 2:sb.append(S.isEmpty()?-1:S.pop());break;
					case 3:sb.append(S.size());break;
					case 4:sb.append(S.isEmpty()?1:0);break;
					case 5:sb.append(S.isEmpty()?-1:S.peek());break;
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}