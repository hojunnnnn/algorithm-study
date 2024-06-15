package programmers.etc;

import java.util.Arrays;

public class 배열_뒤집기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 1, 1, 1, 1, 2};
        int[] arr2 = {1, 0, 1, 1, 1, 3, 5};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));

    }

    public static int[] solution(int[] num_list) {
        int start = 0;
        int end = num_list.length-1;

        while (start < end) {
            int tmp = num_list[start];
            num_list[start] = num_list[end];
            num_list[end] = tmp;

            start++;
            end--;
        }
        return num_list;
    }
}
