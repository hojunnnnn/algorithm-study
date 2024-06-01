import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10870_피보나치_수_5 {
    static int N;

    static int fibo(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;

        return fibo(N - 1) + fibo(N - 2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        System.out.println(fibo(N));
    }}
