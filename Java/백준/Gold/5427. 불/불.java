import java.util.*;
interface Main{
	static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt(),dr[]={0,1,0,-1},dc[]={1,0,-1,0};
		StringBuilder sb=new StringBuilder();
		while(T-->0){
			int W=s.nextInt(),H=s.nextInt(),R=0,B,Q;
			char[][]a=new char[H][W];
			boolean[][]v=new boolean[H][W];
			Queue<int[]>q=new LinkedList<>(),b=new LinkedList<>();
			for(int i=0;i<H;i++){
				String t=s.next();
				for(int j=0;j<W;j++){
					a[i][j]=t.charAt(j);
					if(a[i][j]=='@'){q.add(new int[]{i,j});a[i][j]='.';}
					else if(a[i][j]=='*')b.add(new int[]{i,j});
				}
			}
			l:while(true){
				R++;
				B=b.size();
				Q=q.size();
				while(B-->0){
					int[]bb=b.poll();
					for(int d=0;d<4;d++){
						int i=bb[0]+dr[d],j=bb[1]+dc[d];
						if(i>=0&&j>=0&&i<H&&j<W&&a[i][j]=='.'){
							b.add(new int[]{i,j});
							a[i][j]='*';
						}
					}
				}
				while(Q-->0){
					int[]qq=q.poll();
					for(int d=0;d<4;d++){
						int i=qq[0]+dr[d],j=qq[1]+dc[d];
						if(i<0||j<0||i>=H||j>=W) {
							sb.append(R+"\n");
							break l;
						}
						if(a[i][j]=='.'&&!v[i][j]){
							v[i][j]=true;
							q.add(new int[]{i,j});
						}
					}
				}
				if(q.isEmpty()){
					sb.append("IMPOSSIBLE\n");
					break l;
				}
			}
		}
		System.out.print(sb);
	}
}