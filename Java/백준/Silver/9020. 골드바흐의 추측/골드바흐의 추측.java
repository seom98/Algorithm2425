interface Main{
	static void main(String[]z){
		boolean[]p=new boolean[10001];
		p[0]=p[1]=true;
		for (int i=2;i<=100;i++){
			if(p[i])continue;
			for(int j=i*i;j<10001;j+=i)p[j]=true;
		}
		var s=new java.util.Scanner(System.in);
		int T=s.nextInt(),a,b;
		while (T-->0){
			int n=s.nextInt();
			a=b=n/2;
			while(true){
				if (!p[a]&&!p[b]){
					System.out.println(a+" "+b);
					break;
				}
				a--;b++;
			}
		}
	}
}