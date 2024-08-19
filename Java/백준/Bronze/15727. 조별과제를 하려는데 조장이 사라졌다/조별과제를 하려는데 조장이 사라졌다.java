import java.util.*;
interface Main{
    static void main(String[]s){
        int c=new Scanner(System.in).nextInt();
        System.out.print(c%5==0?c/5:c/5+1);
    }
}