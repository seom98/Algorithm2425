import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		char[]a=s.next().toCharArray();Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--)System.out.print(a[i]);
	}
}