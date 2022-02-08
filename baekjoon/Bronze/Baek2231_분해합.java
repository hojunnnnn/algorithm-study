import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2231_분해합 {
    static int N;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        result = 0;
        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0; // 각 자릿수 합

            while (number != 0) {
                sum += number % 10; // 각 자릿수 더하기
                number /= 10;
            }

            //i 값과 각 자릿수 누적 합이 같을 경우(생성자를 찾을 경우)
            if (sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}