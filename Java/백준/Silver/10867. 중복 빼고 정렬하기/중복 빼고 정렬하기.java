import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a[]=new int[N],b[]=new int[N],C=0;
		List<Integer>c=new ArrayList<>();
		while(N-->0){a[N]=s.nextInt();b[N]=a[N];}
		Arrays.sort(b);
		c.add(b[0]);
		for(int i=1;i<b.length;i++){
			if(b[i]!=b[i-1])c.add(b[i]);
		}
		for(int i=0;i<c.size();i++){
			System.out.print(c.get(i)+" ");
		}
	}
}