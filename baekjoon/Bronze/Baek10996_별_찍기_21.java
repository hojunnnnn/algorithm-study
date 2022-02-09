import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10996_별_찍기_21 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 2 * n; i++) {
            // 홀수행
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        sb.append('*');
                    } else {
                        sb.append(' ');
                    }
                }
            }
            // 짝수행
            else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        sb.append(' ');
                    } else {
                        sb.append('*');
                    }
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    } 
}
