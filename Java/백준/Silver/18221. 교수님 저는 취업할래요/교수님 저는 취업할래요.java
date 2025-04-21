import java.util.*;
interface Main {
    static void main(String[]z){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][]arr=new int[N][N];
        int x=0,y=0,a=0,b=0,c=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=s.nextInt();
                if(arr[i][j]>1){
                    if(arr[i][j]==2){x=i;y=j;}
                    else{a=i;b=j;}
                }
            }
        }
        if(x<a){int t=x;x=a;a=t;}
        if(y<b){int t=y;y=b;b=t;}
        if((x-a)*(x-a)+(y-b)*(y-b)<25){System.out.print(0);return;}
        for(int i=a;i<=x;i++){for(int j=b;j<=y;j++)if(arr[i][j]==1)c++;}
        System.out.print(c>2?1:0);
    }
}