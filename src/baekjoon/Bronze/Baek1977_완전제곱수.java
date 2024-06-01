import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1977_완전제곱수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = (int) Math.ceil(Math.sqrt(M));

        for (int i = min; i <= Math.floor(Math.sqrt(N)); i++) {
            sum += Math.pow(i, 2);
        }
        if (sum > 0) {
            System.out.println(sum);
            System.out.println((int)Math.pow(min, 2));
        } else System.out.println(-1);
    }
}
