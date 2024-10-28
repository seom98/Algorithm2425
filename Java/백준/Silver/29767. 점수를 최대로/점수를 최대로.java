import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
   public static int[] info;
   public static List<Long> result = new ArrayList<>();
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
      
      info = new int[N];
      
      long sum = 0;
      long max = 0;
      
      st = new StringTokenizer(br.readLine());
      
      
      for(int i = 0 ; i < N ; i++) {
         info[i] = Integer.parseInt(st.nextToken());
      }
      
      for(int i = 0; i < N ; i++) {
         sum += info[i];
         result.add(sum);
      }
      
      Collections.sort(result, Collections.reverseOrder());
      
      for(int i = 0; i < K ; i++) {
         max += result.get(i);
      }
      
      System.out.println(max);
      
   }//end of main
   
   
   
   
}//end of class