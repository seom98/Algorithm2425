import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = toInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = toInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++)
                set.add(toInt(st.nextToken()));
            int M = toInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < M; i++)
                sb.append(set.contains(toInt(st.nextToken())) ? 1 : 0).append('\n');
        }
        System.out.print(sb);
    }
    static int toInt(String s) {
        return Integer.parseInt(s);
    }
}