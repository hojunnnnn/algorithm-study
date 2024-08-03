package programmers.etc;

import java.util.Arrays;

public class 문자열_정렬하기_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
    }

    public static int[] solution(String my_string) {
        char[] chars = my_string.replaceAll("[a-z]", "").toCharArray();
        int[] arr = new int[chars.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = chars[i] - '0';
        }
        Arrays.sort(arr);
        return arr;
    }
}
