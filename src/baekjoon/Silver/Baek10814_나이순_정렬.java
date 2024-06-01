import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baek10814_나이순_정렬 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) { //음수 = 그대로, 양수 = 자리바꿈
                return Integer.parseInt(s1[0])- Integer.parseInt(s2[0]);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
/* Best Practice

        StringBuilder[] p = new StringBuilder[201];

        for (int i = 0; i < p.length; i++) {
            p[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            p[age].append(age).append(' ').append(name).append('\n');
        }
        StringBuilder sb = new StringBuilder();

        for (StringBuilder s : p) {
            sb.append(s);
        }
        System.out.println(sb);
*/