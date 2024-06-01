import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 세로 h, 가로 w, 사선 d
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if(h == 0 && w == 0 && d == 0) break;

            if((h * h + w * w) == d * d) {
                System.out.println("right");
            } else if ((h * h + d * d) == w * w) {
                System.out.println("right");
            } else if ((w * w + d * d) == h * h) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
