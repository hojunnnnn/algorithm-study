import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2798_블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); // N장의 카드와 합계를 보여주는 M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int arr[], int N, int M) {
        int result = 0;

        //3개를 고르기 때문에 첫 번째 카드는 N -2까지만 순회
        for (int i = 0; i < N - 2; i++) {

            //두 번째 카드는 첫 번째 카드 다음 부터 N -1까지만 순회
            for (int j = i + 1; j < N - 1; j++) {

                //세 번째 카드는 두 번째 카드 다음 부터 N 까지 순회
                for (int k = j + 1; k < N; k++) {
                    //3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    //M과 temp가 같다면 temp return 및 종료
                    if (temp == M) {
                        return temp;
                    }

                    //세 카드의 합이 이전 합보다 크면서 M보다 작을 경우 result 갱신
                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
