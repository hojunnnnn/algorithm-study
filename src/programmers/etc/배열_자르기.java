package programmers.etc;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열_자르기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 3, 5};
        System.out.println(Arrays.toString(solution(arr, 1, 3)));
        System.out.println(Arrays.toString(solution(arr1, 1, 2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1,num2).map(i -> numbers[i]).toArray();
    }
}
