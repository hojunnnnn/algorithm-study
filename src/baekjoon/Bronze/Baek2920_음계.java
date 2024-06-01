import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek2920_음계 {
    static int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] arrD = {8, 7, 6, 5, 4, 3, 2, 1};
    static int[] n = new int[8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(n, arrA)) System.out.println("ascending");
        else if(Arrays.equals(n, arrD)) System.out.println("descending");
        else System.out.println("mixed");

    }
}
