import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long P = sc.nextInt();
		long[][] arr = new long[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				arr[i][j] = sc.nextLong();
			Arrays.sort(arr[i]);
		}
		int ans = 1;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0; j < M; j++) {
				if(arr[i][j] == -1) count++;
				else {
					if (P >= arr[i][j]) P += arr[i][j];
					else {
						if (count > 0) {
							count--;
							P*=2;
							if (P >= arr[i][j]) P += arr[i][j];
							else ans = 0;
						} else ans = 0;
					}
				}
			}
			while (count > 0) {
				count--;
				P*=2;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}