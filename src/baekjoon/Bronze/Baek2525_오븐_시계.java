import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2525_오븐_시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(br.readLine());

        m += end;
        if (m >= 60) {
            while (m > 59) {
                h++;
                m -= 60;
            }
            if (h > 23) {
                h -= 24;
            }
        }
        System.out.println(h+" "+m);
    }
}
