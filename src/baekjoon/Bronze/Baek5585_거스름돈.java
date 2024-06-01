import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek5585_거스름돈 {
    static int[] money = {500, 100, 50, 10, 5, 1};
    static int N = 0, cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        N = 1000 - N;
        for (int i = 0; i < money.length; i++) {
            cnt += N / money[i];
            N = N % money[i];
        }
        System.out.println(cnt);
    }
}
