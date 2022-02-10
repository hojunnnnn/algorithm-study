import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2902_KMP는_왜_KMP일까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            char ch = st.nextToken().charAt(0);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
