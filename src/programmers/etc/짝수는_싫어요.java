package programmers.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 짝수는_싫어요 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(v -> v).toArray();
    }

//    public static int[] solution(int n) {
//        return IntStream.rangeClosed(1, n).filter(v -> v % 2 != 0).toArray();
//    }
}
