import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2775_부녀회장이_될테야 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 아파트 0 ~ 14 범위
        int[][] aPart = new int[15][15];

        //0층부터 시작 0층의 i호에는 i명이 산다.
        for (int i = 0; i < 15; i++) {
            aPart[i][1] = 1; // i층 1호
            aPart[0][i] = i; // 0층 i호
        }

        for (int i = 1; i < 15; i++) { // 1층부터 14층까지

            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                aPart[i][j] = aPart[i][j-1] + aPart[i -1][j];
            }
        }
        //입력 횟수
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(aPart[k][n]).append('\n');
        }
        System.out.println(sb);
    }
}
