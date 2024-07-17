package programmers.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_회전시키기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(solution(arr, "right")));
        System.out.println(Arrays.toString(solution(arr1, "left")));

    }

    public static int[] solution(int[] numbers, String direction) {
        List<Integer> answer = new ArrayList<>();
        for (int i : numbers) {
            answer.add(i);
        }
        if ("right".equals(direction)) {
            Integer lastIndex = answer.remove(numbers.length-1);
            answer.add(0, lastIndex);
        } else {
            Integer firstIndex = answer.remove(0);
            answer.add(numbers.length-1, firstIndex);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
