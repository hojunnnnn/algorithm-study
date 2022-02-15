import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2748_피보나치_수2 {

    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new long[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = -1;
        }
        arr[0] = 0;
        arr[1] = 1;

        System.out.println(fibo(n));
    }

    static long fibo(int n) {
        if (arr[n] == -1) {
            arr[n] = fibo(n - 1) + fibo(n - 2);
        }
        return arr[n];
    }
}
/*
Top-Down(재귀) 재귀는 함수 호출을 재귀적으로 하면서 변수를 줄여가 작은 단위를 푸는 방식이라면,

Bottom-Up(상향식) 반복문은 작은 문제들을 해결해가면서 큰 문제로 합쳐나가는 방식이다.
        int n = Integer.parseInt(br.readLine());

        long f1 = 0;
        long f2 = 1;
        long sum = 1;
        for (int i = 1; i < n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        System.out.println(sum);
*/