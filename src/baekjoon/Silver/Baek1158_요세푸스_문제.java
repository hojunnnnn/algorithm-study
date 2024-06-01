import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
7 3

7 6 5 4 3 2 1

k -1 = 2
2 1 7 6 5 4 3
<3,
2 1 7 6 5 4
k -1 = 2
5 4 2 1 7 6
<3, 6,
5 4 2 1 7
k -1 = 2
1 7 5 4 2
<3, 6, 2
1 7 5 4
k-1 = 2
5 4 1 7
<3, 6, 2, 7
5 4 1
k - 1 = 2
4 1 5
<3, 6, 2, 7, 5,
4 1
1 4
<3, 6, 2, 7, 5, 1, 4>
*/
public class Baek1158_요세푸스_문제 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        // 1번부터 N번까지 N명의 사람을 offer
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
