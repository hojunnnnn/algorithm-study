package programmers.etc;

public class 배열의_평균값 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(solution(arr));
        System.out.println(solution(arr1));

    }

    public static double solution(int[] numbers) {
        double answer = 0;

        for (int i : numbers) {
            answer += i;
        }

        return answer/numbers.length;
    }
}
