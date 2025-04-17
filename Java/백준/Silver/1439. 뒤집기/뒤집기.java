interface Main{
	static void main(String[]z){
		var s=new java.util.Scanner(System.in);
		int a=0,b=0;String t=s.next();
		char c=t.charAt(0);
		if(c=='0')a++;else b++;
		for(int i=1;i<t.length();i++){
			if(t.charAt(i)!=c){
				c=t.charAt(i);
				if(c=='0')a++;else b++;
			}
		}
		System.out.print(a<=b?a:b);
	}
}