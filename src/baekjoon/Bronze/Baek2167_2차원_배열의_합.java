import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2167_2차원_배열의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //배열의 크기
        int[][] arr = new int[N][M];
        //N개의 줄에 M개의 정수로 배열이 주어진다.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //합을 구할 부분의 개수 k가 주어지고, 다음 k개의 줄에는 네 개의 정수로 i, j, x, y가 주어진다.
        int k = Integer.parseInt(br.readLine());
        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int sum = 0;
            for (int a = i - 1; a < x; a++) {
                for (int b = j - 1; b < y; b++) {
                    sum += arr[a][b];
                }
            }
            System.out.println(sum);
        }
    }
}
