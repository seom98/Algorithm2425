import java.util.*;
interface Main{
    static void main(String[]z){
        Scanner c=new Scanner(System.in);
		int T=c.nextInt();
        while(T-->0){
			int N=c.nextInt(),o[]=new int[N],a[][]=new int[201][5],C=0;
			for(int i=1;i<201;i++)a[i][0]=i;
			for(int i=0;i<N;i++){
				o[i]=c.nextInt();
				a[o[i]][1]++;
			}
	        for(int i=0;i<N;i++){
				if(a[o[i]][1]>5){
					C++;
					a[o[i]][2]++;
					if(a[o[i]][2]<5)a[o[i]][3]+=C;
					else if(a[o[i]][2]<6)a[o[i]][4]=C;
				}
	        }
			Arrays.sort(a,(x,y)->y[1]!=x[1]?y[1]-x[1]:x[3]!=y[3]?x[3]-y[3]:x[4]-y[4]);
			System.out.println(a[0][0]);
        }
    }
}