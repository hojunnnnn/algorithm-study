import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 그리디_1이_될_때까지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 25
        int K = Integer.parseInt(st.nextToken()); // 5
        int result = 0;

        while (true) {
            if (N == 1) {
                break;
            } else if (N % K == 0) { // 1(true) 2(true)
                N /= K; // 1(5) 2(1)
                result++; // 1(1) 2(2)
            } else {
                N--;
                result++;
            }
        }
        System.out.println(result);
    }
}
