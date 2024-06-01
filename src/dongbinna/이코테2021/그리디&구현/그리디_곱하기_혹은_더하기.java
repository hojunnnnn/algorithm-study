import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그리디_곱하기_혹은_더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int total = s.charAt(0) -'0';

        for (int i = 1; i < s.length(); i++) {
            int n = s.charAt(i) - '0';

            if (total <= 1 || n <= 1) {
                total += n;
            } else {
                total *= n;
            }
        }
        System.out.println(total);
    }
}
