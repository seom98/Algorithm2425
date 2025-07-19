interface Main{
	static void main(String[]z){
		int n=new java.util.Scanner(System.in).nextInt();
		long ans =0;
		for(int start=1, len=1; start<=n; start*=10, len++) {
			int end = start*10-1;
			if(end > n) {
				end = n;
			}

			ans += (long)(end-start+1) * len;
		}
		System.out.print(ans);
	}
}