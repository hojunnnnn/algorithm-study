import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2609_최대공약수와_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int n3 = gcd(n1, n2);

        System.out.println(n3);
        System.out.println(n1 * n2 / n3);
   }

    public static int gcd(int n1, int n2) {
        while (n2 != 0) {
            int n4 = n1 % n2;
            n1 = n2;
            n2 = n4;
        }
        return n1;
    }
}
