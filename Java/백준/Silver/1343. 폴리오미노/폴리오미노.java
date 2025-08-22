import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);String S=s.next();
		System.out.print(p(S));
	}
	static String p(String S){
	  String A="AAAA",B="BB";
	  S=S.replaceAll("XXXX",A);
	  S=S.replaceAll("XX",B);
	  if(S.contains("X"))S="-1";
	  return S;
	}
}