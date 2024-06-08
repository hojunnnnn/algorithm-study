package programmers.etc;

public class 피자_나눠_먹기_2 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
        System.out.println(solution(1));
    }

    public static int solution(int n) {
        int answer = 1;
        while ((6 * answer) % n != 0) {
            answer++;
        }
        return answer;
    }
}