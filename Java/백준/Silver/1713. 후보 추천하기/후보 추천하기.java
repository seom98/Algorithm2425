import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),n=s.nextInt();
		HashMap<Integer,int[]>m=new HashMap<>();
		while(n-->0){
			int i=s.nextInt();
			if(m.containsKey(i))m.put(i,new int[]{m.get(i)[0]+1,m.get(i)[1]});
			else {
				if (m.size()<N){
					m.put(i,new int[]{1,n});
				} else {
					int b0=1000,b1=1000,b=0;
					for(int j:m.keySet()){
						int[]k=m.get(j);
						if(k[0]<b0){b0=k[0];b1=k[1];b=j;}
						else if(k[0]==b0&&k[1]>b1){b1=k[1];b=j;}
					}
					m.remove(b);
					m.put(i,new int[]{1,n});
				}
			}
		}
		PriorityQueue<Integer>q=new PriorityQueue<>();
		for(int j:m.keySet())q.add(j);
		while(!q.isEmpty())System.out.print(q.poll()+" ");
	}
}