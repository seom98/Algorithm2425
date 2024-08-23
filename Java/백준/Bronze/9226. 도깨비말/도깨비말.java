import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner c=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		while(true){
			char s[]=c.next().toCharArray();
			int n=s.length,m=0;
			if(s[0]=='#')break;
			for(int i=0;i<n;i++){
				if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){m=i;break;}
			}
			for(int i=m;i<n;i++)sb.append(s[i]);
			for(int i=0;i<m;i++)sb.append(s[i]);
			sb.append("ay\n");
		}
		System.out.print(sb);
	}
}