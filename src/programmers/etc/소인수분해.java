package programmers.etc;

import java.util.ArrayList;
import java.util.Arrays;

public class 소인수분해 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n/=i;
                }
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
