import java.util.*;
import java.io.*;
public class Main{
	static char RSP[] = {'R','S','P'},output[],arr[][];
	static int N,M,K,win[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		win = new int[N];
		arr = new char[N][];
		Arrays.fill(win,-1);
		output = new char[M];
		for(int i=0;i<N;i++)arr[i] = br.readLine().toCharArray();
		rsp(0, N);
		if(sb.length()==0)sb.append(-1);
		System.out.print(sb);
	}
	static void rsp(int r, int gift){
		if(gift<=0) return;
		else if(gift<=K){
			sb.setLength(0);
			sb.append(r).append("\n");
			for(int i=0;i<r;i++)sb.append(output[i]);
			M=r-1;
			return;
		}
		int count = 0;
		for(int i=0;i<3;i++){
			if(r>=M)return;
			output[r]=RSP[i];
			count = 0;
			for(int j=0;j<N;j++){
				if(win[j]!=-1||arr[j][r]==RSP[i==0 ? 2:i-1])continue;
				win[j]=r;
				count++;
			}
			rsp(r+1, gift-count);
			for(int j=0;j<N;j++){
				if(win[j]==r) win[j] = -1;
			}
		}
	}
}