import java.io.*;
import java.util.*;

class Main{
	static int min=5000,N,M,K,arr[][],rcs[][],copy[][];
	static int[] result,nums,visited,dr={0,1,0,-1},dc={1,0,-1,0};
	public static void main(String[]z)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());M=Integer.parseInt(st.nextToken());K=Integer.parseInt(st.nextToken());
		arr=new int[N][M];rcs=new int[K][3];nums=new int[K];result=new int[K];visited=new int[K];copy=new int[N][M];
		for(int i=0;i<K;i++)nums[i]=i;
		for(int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++)arr[i][j]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<K;i++){
			st=new StringTokenizer(br.readLine());
			for(int k=0;k<3;k++)rcs[i][k]=Integer.parseInt(st.nextToken());
		}
		NM(0);
		System.out.print(min);
	}
	static void NM(int x){
		if(x==K){
			for(int i=0;i<N;i++){for(int j=0;j<M;j++)copy[i][j]=arr[i][j];}
			for(int i=0;i<K;i++)rotate(result[i]);

			for(int i=0;i<N;i++){
				int sum=0;
				for(int j=0;j<M;j++)sum+=copy[i][j];
				if(sum<min)min=sum;
//				System.out.println(sum);
			}
			return;
		}
		for(int i=0;i<K;i++){
			if(visited[i]==0){
				result[x]=nums[i];
				visited[i]=1;
				NM(x+1);
				visited[i]=0;
			}
		}
	}
	static void rotate(int x){
		int r=rcs[x][0]-1,c=rcs[x][1]-1,S=rcs[x][2];
//		System.out.println(r+ "   "+ c);
		for(int s=1;s<=S;s++){
			int r1=r-s,r2=r+s,c1=c-s,c2=c+s,d=0,temp,temp2=0;
			int R=r1,C=c1;
			temp=copy[R][C];
//			System.out.println(R+" "+C);
			while(d<4){
				R+=dr[d];
				C+=dc[d];
//				System.out.println(R+" "+C);
				if(R==r2&&C==c1||R==r2&&C==c2||R==r1&&C==c2||R==r1&&C==c1){d++;if(d==4)break;}
				temp2=copy[R][C]; //새로운좌표값저장
				copy[R][C]=temp; //새로운좌표에 이전값저장
				temp=temp2; //이전값을 새로운좌표값으로 저장
			}

			copy[r1][c1]=temp;
		}
//		for(int i=0;i<N;i++){for(int j=0;j<M;j++)System.out.print(copy[i][j]+ " ");System.out.println();}
	}
}