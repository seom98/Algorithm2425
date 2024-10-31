import java.util.*;
interface Main{
	static void main(String[]y){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),n=1;
		StringBuilder sb=new StringBuilder();
		while(N-->0){
			sb.append("Case "+n+++":\n");
			int m=-1,r[][]=new int[2][2],z=0,o,p,q,u;
			char c[][]=new char[3][3];
			while(++m<3)c[m]=s.next().toCharArray();
			char a=s.next().charAt(0);
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(c[i][j]==a){
						r[z][0]=i;
						r[z++][1]=j;
					}
				}
			}
			o=r[0][0];p=r[0][1];q=r[1][0];u=r[1][1];
			if(o==q)c[o][3-p-u]=a;
			else if(p==u)c[3-o-q][p]=a;
			else c[3-o-q][3-p-u]=a;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++)sb.append(c[i][j]);
				sb.append('\n');
			}
		}
		System.out.print(sb);
	}
}