import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10797_10부제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            int car = Integer.parseInt(st.nextToken());
            if (car == n) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
