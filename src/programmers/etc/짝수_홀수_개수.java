package programmers.etc;

import java.util.Arrays;

public class 짝수_홀수_개수 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 3, 5, 7};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr1)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            if (i % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
