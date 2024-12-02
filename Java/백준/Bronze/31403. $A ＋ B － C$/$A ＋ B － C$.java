import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();int c=s.nextInt();
		String S=a+b;
		System.out.print((Integer.parseInt(a)+Integer.parseInt(b)-c)+"\n"+(Integer.parseInt(S)-c));
	}
}