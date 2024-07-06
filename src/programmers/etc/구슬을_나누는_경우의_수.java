package programmers.etc;

public class 구슬을_나누는_경우의_수 {
    public static void main(String[] args) {
        System.out.println(solution(3,2));
        System.out.println(solution(5,3));
    }

    public static int solution(int balls, int share) {
        return combination(balls, share);
    }
    private static int combination(int n, int r) {
        // base case
        if (r == 0 || r == n) {
            return 1;
        }
        // recursive case
        return combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
