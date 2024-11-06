import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		while(true){
			boolean ans=true;int X=0,O=0,x=0,o=0;String T=s.next();char t[][]=new char[3][3],a;
			if(T.equals("end"))break;
			for(int i=0,j=0;i<9;i++,j+=i%3==0?1:0){a=T.charAt(i);t[j][i-j*3]=a;if(a=='X')X++;else if(a=='O')O++;}
			for(int i=0;i<3;i++){
				if(t[i][0]==t[i][1]&&t[i][1]==t[i][2]){a=t[i][0];if(a=='X')x++;else if(a=='O')o++;}
				if(t[0][i]==t[1][i]&&t[1][i]==t[2][i]){a=t[0][i];if(a=='X')x++;else if(a=='O')o++;}
			}
			if(t[0][0]==t[1][1]&&t[1][1]==t[2][2]){a=t[1][1];if(a=='X')x++;else if(a=='O')o++;}
			if(t[0][2]==t[1][1]&&t[1][1]==t[2][0]){a=t[1][1];if(a=='X')x++;else if(a=='O')o++;}
			if(!(X==O||X-O==1)||X<3||(x==0&&o==0&&X+O<9)||(x>0&&o>0)||(X-O==1&&o>0)||(X==O&&x>0))ans=false;
			System.out.println(ans?"valid":"invalid");
		}
	}
}