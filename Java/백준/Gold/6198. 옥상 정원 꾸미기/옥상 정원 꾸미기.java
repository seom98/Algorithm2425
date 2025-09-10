import java.util.*;
interface Main{
    static void main(String[]z){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(),i,H;
        long ans=0;
        Stack<Integer>stack=new Stack<>();
        for(i=0;i<N;i++){
            H=s.nextInt();
            while(!stack.isEmpty()){
                if(stack.peek()<=H)stack.pop();
                else break;
            }
            ans+=stack.size();
            stack.push(H);
        }
        System.out.print(ans);
    }
}