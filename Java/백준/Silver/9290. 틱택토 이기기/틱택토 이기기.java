import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),n=1;
		StringBuilder sb=new StringBuilder();
		while(N-->0){
			sb.append("Case "+n+++":\n");
			int M=-1,t[][]=new int[2][2],b=0,i=-1,j=0;
			char c[][]=new char[3][3];
			while(++M<3)c[M]=s.next().toCharArray();
			char a=s.next().charAt(0);
			while(++i<3){
				j=-1;
				while(++j<3){
					if(c[i][j]==a){t[b][0]=i;t[b++][1]=j;}
				}
			}
			int o=t[0][0],p=t[0][1],q=t[1][0],r=t[1][1];
			if(o==q)c[o][3-p-r]=a;
			else if(p==r)c[3-o-q][p]=a;
			else c[3-o-q][3-p-r]=a;
			i=-1;
			while(++i<3){
				j=-1;
				while(++j<3)sb.append(c[i][j]);
				sb.append('\n');
			}
		}
		System.out.print(sb);
	}
}