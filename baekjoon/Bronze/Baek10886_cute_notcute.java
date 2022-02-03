import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10886_cute_notcute {
    static int N;
    static int cute = 0;
    static int notCute = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cute = 0;
        notCute = 0;
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());

            if(M == 1) cute++;
            else notCute++;
        }
        if(cute > notCute) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}
