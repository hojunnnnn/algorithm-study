package programmers.etc;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;
        int factorial = 1;
        int i = 1;
        while (true) {
            factorial = factorial * i;
            if(factorial > n) break;
            answer = i;
            i++;
        }
        return answer;
    }
}
