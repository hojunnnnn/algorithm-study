import java.io.*;
import java.util.StringTokenizer;

public class Baek1018_체스판_다시_칠하기 {
    static char ch[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ch = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                ch[i][j] = str.charAt(j);
            }
        }
        int ans = 1000000;

        // 최소 크기가 8*8일 때 경우의 수는 1이기 때문에 각 가로 세로별 길이에 -7
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                ans = Math.min(ans, find(i, j));
            }
        }
        System.out.println(ans);
    }
    public static int find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int B = 0; // B부터 시작할 때 다시 칠해야 하는 정사각형 수
        int W = 0; // W부터 시작할 때 다시 칠해야 하는 정사각형 수

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if ((i + j) % 2 == 0) {
                    if (ch[i][j] == 'B') W++;
                    else B++;
                }
                else { // (i + j) % 2 == 1
                    if(ch[i][j] == 'W') W++;
                    else B++;
                }
            }
            System.out.println("B : " +B);
            System.out.println("W : " +W);
        }
        return Math.min(B, W);
    }
}
