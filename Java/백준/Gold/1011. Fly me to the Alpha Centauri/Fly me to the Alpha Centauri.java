import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 미리 충분한 용량 설정

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int time = M - N;

            int x = (int) Math.sqrt(time);
            int xSquare = x * x; // 제곱 값을 미리 계산

            if (x == Math.sqrt(time)) {
                sb.append(x * 2 - 1).append('\n');
            } else if (time <= xSquare + x) {
                sb.append(x * 2).append('\n');
            }else {
                sb.append(x * 2 + 1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
