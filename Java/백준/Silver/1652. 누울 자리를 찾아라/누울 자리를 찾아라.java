import java.util.*;
interface Main{
    static void main(String[]Z){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(),i,j,c=0,d=0;
        char[][]a=new char[N][N];
        for(i=0;i<N;i++)a[i]=s.next().toCharArray();
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                if(a[i][j]=='.'){
                    int k=1;
                    while(++j<N){
                        if(a[i][j]=='.')k++;
                        else break;
                    }
                    if(k>1)c++;
                }
            }
        }
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                if(a[j][i]=='.'){
                    int k=1;
                    while(++j<N){
                        if(a[j][i]=='.')k++;
                        else break;
                    }
                    if(k>1)d++;
                }
            }
        }
        System.out.print(c+" "+d);
    }
}