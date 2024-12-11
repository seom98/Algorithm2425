import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),C=N,a[],v;
		while(N-->0){
			a=new int[28];
			z=s.next().split(" ");
			a[z[0].charAt(0)-97]=1;
			for(int i=1;i<z[0].length();i++){
				v=z[0].charAt(i)-97;
				if(z[0].charAt(i-1)==v+97)continue;
				else if(a[v]==0)a[v]=1;
				else {C--;break;}
			}

		}
		System.out.print(C);
	}
}