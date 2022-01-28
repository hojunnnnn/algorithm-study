import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1100_하얀_칸 {

    static final int SIZE = 8;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] board = new char[SIZE][SIZE];
        int cnt = 0;
        for (int i = 0; i < SIZE; i++) {
            String str = br.readLine();
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = str.charAt(j);
                if ((i + j) % 2 == 0 && board[i][j] == 'F') {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
