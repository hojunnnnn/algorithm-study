import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2490_윷놀이 {
    static int total = 0;

    static void game(int n) {
        switch (n) {
            case 1:
                System.out.println("C");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("A");
                break;
            case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u1 = Integer.parseInt(st.nextToken());
            int u2 = Integer.parseInt(st.nextToken());
            int u3 = Integer.parseInt(st.nextToken());
            int u4 = Integer.parseInt(st.nextToken());
            total = u1 + u2 + u3 + u4;

            game(total);
        }
    }
}
