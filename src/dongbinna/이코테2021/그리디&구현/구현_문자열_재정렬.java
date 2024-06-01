import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 구현_문자열_재정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        ArrayList<Character> result = new ArrayList<>();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                result.add(s.charAt(i));
            } else {
                val += s.charAt(i) - '0';
            }
        }
        //알파벳 오름차순 정렬
        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
        if(val != 0) System.out.print(val);
    }
}