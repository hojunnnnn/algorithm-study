import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11721_열_개씩_끊어_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

            if (i % 10 == 9) { // 10의 배수가 될 때 개행
               System.out.println();
            }
        }
    }
}
