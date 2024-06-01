import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11655_ROT13 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] ch = br.readLine().toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && 'Z' >= ch[i]) {
                if (ch[i] >= 'N') ch[i] -= 13;
                else ch[i] += 13;
            }
            else if (ch[i] >= 'a' && 'z' >= ch[i]) {
                if(ch[i] >= 'n') ch[i] -= 13;
                else ch[i] += 13;
            }
            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
