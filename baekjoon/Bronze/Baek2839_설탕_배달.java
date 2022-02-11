import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2839_설탕_배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (N == 4 || N == 7) {
                System.out.println(-1);
                break;
            }
            if (N % 5 == 0) {
                cnt += N / 5;
                System.out.println(cnt);
                break;
            }
            else {
                 N -= 3;
                 cnt++;
            }
        }
    }
}
