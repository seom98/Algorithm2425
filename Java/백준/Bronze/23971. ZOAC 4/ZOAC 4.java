import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
		System.out.print(((a+c)/(c+1))*((b+d)/(d+1)));
	}
}