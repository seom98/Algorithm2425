import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int a[]=new int[25],v[]=new int[25],i,j,k,c,l;
		for(i=0;i<25;i++)a[s.nextInt()-1]=i;
		for(i=0;i<25;i++){
			c=0;v[a[s.nextInt()-1]]=1;
			for(j=0;j<25;j+=5){l=0;for(k=j;k<j+5;k++)l+=v[k];if(l==5)c++;}
			for(j=0;j<5;j++){l=0;for(k=j;k<=j+20;k+=5)l+=v[k];if(l==5)c++;}
			l=0;for(k=0;k<25;k+=6)l+=v[k];if(l==5)c++;
			l=0;for(k=4;k<21;k+=4)l+=v[k];if(l==5)c++;
			if(c>=3){System.out.print(i+1);return;}
		}
	}
}