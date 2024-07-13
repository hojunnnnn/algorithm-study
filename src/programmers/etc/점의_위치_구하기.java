package programmers.etc;

public class 점의_위치_구하기 {
    public static void main(String[] args) {
        int[] arr = {2, 4};
        int[] arr1 = {-7, 9};
        System.out.println(solution(arr));
        System.out.println(solution(arr1));
    }

    public static int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
