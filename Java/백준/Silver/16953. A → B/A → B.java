import java.util.Scanner;

public class Main {
	
	static int A, B;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		sc.close();

		int count = 1;
		while (A != B) {
			if (B < A) {
                System.out.println(-1);
                return;
            }
            if (B % 10 == 1) B /= 10;
            else if (B % 2 == 0) B /= 2;
            else {
                System.out.println(-1);
                return;
            }
            count++;
        }
        System.out.println(count);
    }
}