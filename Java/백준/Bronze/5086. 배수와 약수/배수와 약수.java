import java.util.*;
interface Main{
    static void main(String[]x){
        Scanner sc=new Scanner(System.in);
        String ans;
        while(true) {
            int i=sc.nextInt(),j=sc.nextInt();
            if(i==0&&j==0)break;
            if(j%i==0)ans="factor";
            else if(i%j==0)ans="multiple";
            else ans="neither";
            System.out.println(ans);
        }
    }
}