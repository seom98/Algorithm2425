import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int m=s.nextInt(),M=s.nextInt(),a[][]=new int[M][m],x=1;
		for(int i=0;i<M;i++){for(int j=0;j<m;j++)a[i][j]=s.nextInt();}
		for(int i=0;i<m;i++){for(int j=M-1;j>=0;j--){if(s.nextInt()!=a[j][i])x=0;}}
		System.out.print(x<1?"|>___/|     /}\n| O O |    / }\n( =0= )\"\"\"\"  \\\n| ^  ____    |\n|_|_/    ||__|":"|>___/|        /}\n| O < |       / }\n(==0==)------/ }\n| ^  _____    |\n|_|_/     ||__|");
	}
}