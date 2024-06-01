import java.io.*;

public class Baek2581_소수 {
        //에라토스테네스의 체
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
    
            boolean[] arr = new boolean[N + 1]; //최대치 배열 할당
    
            arr[0] = true;
            arr[1] = true;
    
            for (int i = 2; i <= Math.sqrt(N + 1); i++) {
                //i의 제곱수 부터 검사하므로 i는 전체범위 (N+1의 제곱근까지 검사)
                for (int j = i * i; j < N + 1; j += i) { // i*i 처음에 4..6..8..다음은 3의 배수...
                    arr[j] = true; // 소수가 아닌 수는 true
                }
            }
    
            int min = Integer.MAX_VALUE; // 최솟값 변수
            int sum = 0;
            for (int i = M; i < N + 1; i++) {
                if (!arr[i]) {
                    if(min > i) {
                        min = i;
                    }
                    sum += i;
                }
            }
            if (sum == 0) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
                System.out.println(min);
            }
        }
}
