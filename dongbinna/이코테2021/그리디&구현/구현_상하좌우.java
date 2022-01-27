import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구현_상하좌우 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //공간의 크기를 나타내는 N
        // 왼, 오, 위, 아 이동 방향
        int[] dx = {0, 0, -1, 1}; 
        int[] dy = {-1, 1, 0, 0}; 

        char[] moveTypes = {'L', 'R', 'U', 'D'};

        //현재 위치
        int x = 1; 
        int y = 1; 

        StringTokenizer st = new StringTokenizer(br.readLine()); // 이동할 계획서 내용

        while (st.hasMoreTokens()) {
            char ch = st.nextToken().charAt(0);
            //이동 후 좌표
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (ch == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > N || ny > N) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
