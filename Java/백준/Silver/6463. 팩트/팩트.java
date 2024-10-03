import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuilder sb = new StringBuilder();
            int N = sc.nextInt();
            int M = 1;
            for (int i = 1; i <=N; i++) {
                int b = i * M;
                while ( b % 10 == 0) {
                    b = b / 10;
                }
                M = b % 100000;
            }
            switch (Integer.toString(N).length()) {
                case 1 : sb.append("    "); break;
                case 2 : sb.append("   "); break;
                case 3 : sb.append("  "); break;
                case 4 : sb.append(" "); break;
            }
            sb.append(N + " -> " + (M % 10) + '\n');
            System.out.print(sb);
        }
    }
}