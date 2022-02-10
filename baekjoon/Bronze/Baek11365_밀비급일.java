import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11365_밀비급일 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        while (true) {
            String str = br.readLine();
            if(str.equals("END")) break;
            sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();
            System.out.println(reverse);
        }
    } 
}
