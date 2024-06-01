import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구현_왕실의_나이트 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        int row = inputData.charAt(1) - '0'; // 가로
        int column = inputData.charAt(0) - 'a' + 1; // 세로
        System.out.println(row);
        System.out.println(column);
        //나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; 
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1}; 

        int result = 0;
        for (int i = 0; i < 8; i++) {
            //이동하고자 하는 위치 확인
            int nextRow = row + dx[i]; 
            int nextColumn = column + dy[i]; 

            //해당 위치로 이동 가능하면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result++;
            }
        }
        System.out.println(result);
    }
}
