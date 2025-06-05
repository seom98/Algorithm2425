import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),A=0,C=0,G=0,T=0,count=0;
		char[]arr=s.next().toCharArray();
		int a=s.nextInt(),c=s.nextInt(),g=s.nextInt(),t=s.nextInt();
		for(int i=0;i<M;i++){
			switch(arr[i]){
				case 'A':A++;break;
				case 'C':C++;break;
				case 'G':G++;break;
				case 'T':T++;break;
			}
		}
		if(a<=A&&c<=C&&g<=G&&t<=T)count++;
		for(int i=M;i<N;i++){
			switch(arr[i]){
				case 'A':A++;break;
				case 'C':C++;break;
				case 'G':G++;break;
				case 'T':T++;break;
			}
			switch(arr[i-M]){
				case 'A':A--;break;
				case 'C':C--;break;
				case 'G':G--;break;
				case 'T':T--;break;
			}
			if(a<=A&&c<=C&&g<=G&&t<=T)count++;
		}
		System.out.print(count);
	}
}