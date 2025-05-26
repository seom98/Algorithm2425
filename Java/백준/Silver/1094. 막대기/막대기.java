interface Main {
	static void main(String[]z){
		int N=new java.util.Scanner(System.in).nextInt(),c=0;
		while(N>0){c+=N&1;N>>=1;}
		System.out.print(c);
	}
}