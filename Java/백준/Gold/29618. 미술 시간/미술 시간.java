import java.util.*;
import java.io.*;
interface Main{
    static void main(String[]z)throws IOException{
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(s.readLine());
        int N=Integer.parseInt(st.nextToken()),Q=Integer.parseInt(st.nextToken());;
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=1;i<=N;i++)set.add(i);
        int[]r=new int[N+1];
        while(Q-->0){
            st=new StringTokenizer(s.readLine());
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
            Queue<Integer>q=new LinkedList<>();
            for(Integer it=set.ceiling(a);it!=null&&it<=b;it=set.higher(it)){
                r[it]=x;q.add(it);
            }
            while(!q.isEmpty())set.remove(q.poll());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=N;i++)sb.append(r[i]).append(" ");
        System.out.print(sb);
    }
}