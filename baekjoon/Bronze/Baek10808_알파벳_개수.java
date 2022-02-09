import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10808_알파벳_개수 {
    static int[] alphabet = new int[26];
    static String s;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    } 
}
