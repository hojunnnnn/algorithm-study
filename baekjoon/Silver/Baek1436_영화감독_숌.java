import java.io.*;

// 첫 번째는 666, 두 번째는 1666 그 다음 3666, ... 5666, 6660, 6661, 6662 ...
public class Baek1436_영화감독_숌 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 몇 번째 영화제목?

        int number = 666;
        int cnt = 1;

        while (cnt != N) {
            number++; // 667.. 668.. 669.. ~~ 1666
            if (String.valueOf(number).contains("666")) {
                cnt++;
            }
        }
        System.out.println(number);
    }
}
