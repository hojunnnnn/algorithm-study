package programmers.etc;

public class 주사위의_개수 {
    public static void main(String[] args) {
        int[] box = {1, 1, 1};
        int[] box1 = {10, 8, 6};
        System.out.println(solution(box, 1));
        System.out.println(solution(box1, 3));

    }

    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
