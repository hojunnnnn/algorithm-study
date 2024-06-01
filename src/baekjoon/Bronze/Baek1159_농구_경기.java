import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1159_농구_경기 {
    static final int ASCII = 97;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] player = new int[26];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            char firstName = s.charAt(0);
            player[firstName - ASCII]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < player.length; i++) {
            if (player[i] >= 5) {
                sb.append((char) (i + ASCII));
            }
        }
        if (sb.length() == 0) System.out.println("PREDAJA");
        else System.out.println(sb);
    }
}
