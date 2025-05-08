import java.util.*;
class Main{
    static int[]a, don;
    public static void main(String[]z){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(),M=s.nextInt(),K=s.nextInt(),sum=0,x,y;a=new int[N+1];don=new int[N+1];
        for(int i=1;i<=N;i++){a[i]=i;don[i]=s.nextInt();}
        for(int i=0;i<M;i++){
            x=s.nextInt();
            y=s.nextInt();
            union(x,y);
        }
        for(int i=1;i<=N;i++){
            if(a[i]==i){
                K-=don[i];
                if(K>=0)sum+=don[i];
                else{System.out.print("Oh no");return;}
            }
        }
        System.out.print(sum);
    }
    static void union(int x,int y){
        x=find(x);
        y=find(y);
        if(x!=y){
            if(don[x]>don[y])a[x]=y;
            else a[y]=x;
        }
    }
    static int find(int x){
        if(x!=a[x])a[x]=find(a[x]);
        return a[x];
    }
}