import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.next(), "-");
		int day = sc.nextInt();

		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		// 전체 일수 계산
		int totalDays = d + day;

		// 월 조정
		while (totalDays > 30) {
			totalDays -= 30;
			m++;
			if (m > 12) {
				m = 1;
				y++;
			}
		}

		StringBuilder sb = new StringBuilder();
		// 년도 포맷팅
		if (y < 10) sb.append("000");
		else if (y < 100) sb.append("00");
		else if (y < 1000) sb.append("0");
		sb.append(y).append("-");

		// 월 포맷팅
		if (m < 10) sb.append("0");
		sb.append(m).append("-");

		// 일 포맷팅
		if (totalDays < 10) sb.append("0");
		sb.append(totalDays);

		System.out.println(sb);
		sc.close();
	}
}
