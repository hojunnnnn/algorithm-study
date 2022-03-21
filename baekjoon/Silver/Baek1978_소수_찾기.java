import java.io.*;
import java.util.StringTokenizer;

public class Baek1978_소수_찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while (N > 0) {
            N--;
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) cnt++;
        }
        System.out.println(cnt);
    }
    private static boolean isPrime(int num) {
        if(num == 1) return false;

        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
