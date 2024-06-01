import java.io.*;
import java.util.StringTokenizer;

public class Baek1934_최소공배수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int n1, n2;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());

            int n3 = gcd(n1, n2);
            sb.append(n1 * n2 / n3).append('\n'); //입력받은 두 수의 곱에서 최대공약수를 나눠주면 끝
        }
        System.out.println(sb);
    }

    public static int gcd(int n1, int n2) {
        while (n2 != 0) {
            int n4 = n1 % n2;
            
            // GCD(n1, n2) = GCD(n2, n4)
            n1 = n2;
            n2 = n4;
        }
        return n1;
    }
}
