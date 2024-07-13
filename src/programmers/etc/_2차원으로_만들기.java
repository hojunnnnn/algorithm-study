package programmers.etc;

import java.util.Arrays;

public class _2차원으로_만들기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr1 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        System.out.println(Arrays.deepToString(solution(arr, 2)));
        System.out.println(Arrays.deepToString(solution(arr1, 3)));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] arr = new int[num_list.length/n][n];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = num_list[index];
                index++;
            }
        }
        return arr;
    }
}
