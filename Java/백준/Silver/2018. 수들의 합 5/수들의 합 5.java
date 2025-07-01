interface Main{
	static void main(String[]z){
		int N=new java.util.Scanner(System.in).nextInt(),s=0,e=0,S=0,C=0;
		while(s<=N){
			while(++e<=N){S+=e;if(S>=N){if(S==N)C++;break;}}
			while(++s<=N){S-=s;if(S<=N){if(S==N)C++;break;}}
		}
		System.out.print(C);
	}
}