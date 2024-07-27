package programmers.etc;

import java.util.Arrays;

public class 최댓값_만들기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers1 = {0, 31, 24, 10, 10, 1, 9};
        System.out.println(solution(numbers));
        System.out.println(solution(numbers1));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
