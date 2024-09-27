import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		for (int i = 0; i < 4; i++) {
			x1 += sc.nextInt();
			y1 += sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			x2 += sc.nextInt();
			y2 += sc.nextInt();
		}

		long dy = y1 - y2;
		long dx = x1 - x2;
		long gcd1 = findGCD(dy, dx);
		dy = dy / gcd1;
		dx = dx / gcd1;

		if (dx < 0) {
			dy = -dy;
			dx = -dx;
		}

		long y0 = dx * y1 - dy * x1;
		long x0 = dx * 4;
		long gcd2 = findGCD(y0, x0);
		y0 = y0 / gcd2;
		x0 = x0 / gcd2;

		if (x0 < 0) {
			y0 = -y0;
			x0 = -x0;
		}

		if (dx != 1 && x0 != 1) {
			System.out.print(dy + "/" + dx + " " + y0 + "/" + x0);
		} else if (dx == 1 && x0 != 1) {
			System.out.print(dy + " " + y0 + "/" + x0);
		} else if (dx != 1 && x0 == 1) {
			System.out.print(dy + "/" + dx + " " + y0);
		} else if (dx == 1 && x0 == 1) {
			System.out.print(dy + " " + y0);
		}
		sc.close();
	}

	// 최대공약수(GCD)를 계산하는 함수
	public static long findGCD(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
