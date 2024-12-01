import java.util.*;
interface Main {
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),a[]=new int[N],d[]=new int[N],m,l,r,len=1,key;
		for(int i=0;i<N;i++)a[i]=s.nextInt();d[0]=a[0];
		for(int i=1;i<N;i++){
			key=a[i];
			if(d[len-1]<key){len++;d[len-1]=key;}
			else{
				l=0;r=len;
				while(l<r){m=(l+r)/2;if(d[m]<key)l=m+1;else r=m;}
				d[l]=key;
			}
		}
		System.out.print(len);
	}
}