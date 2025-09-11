import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dfs(0, n);
	}
	
	static void dfs(int num, int n) {
		if(n==0) {
			System.out.println(num);
		}
		for(int i=1; i<10; i++) {
			int tmp = 10*num +i;
			if(n>0 && isPrime(tmp)) {
				dfs(tmp, n-1);	
			} 
		}
	}
	
	static boolean isPrime(int num) {
		if(num <2) return false;
		for(int i=2 ; i*i<=num; i++) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;
	}
}