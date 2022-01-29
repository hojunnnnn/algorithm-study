import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10872_팩토리얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        while (N != 0) {
            sum = sum * N;
            N--;
        }
//        int sum = factorial(N);
        System.out.println(sum);
    }

/*    static int factorial(int N) {
        if(N <= 1) return 1;
        return N * factorial(N - 1);
    }*/
}
