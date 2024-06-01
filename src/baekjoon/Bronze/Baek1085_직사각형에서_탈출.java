import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1085_직사각형에서_탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 현재 위치 x, y || 오른쪽 위 꼭짓점 w, h
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        // Math.min으로 값 비교 후 작은 값 리턴
        int min_x = Math.min(x, w-x);
        int min_y = Math.min(y, h-y);

        System.out.println(Math.min(min_x, min_y));
    }
}