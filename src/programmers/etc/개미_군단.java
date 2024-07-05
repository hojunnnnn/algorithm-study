package programmers.etc;

public class 개미_군단 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        int answer = 0;

        if (hp >= 5) {
            answer += hp / 5;
            hp = hp % 5;
        }

        if (hp >= 3) {
            answer += hp / 3;
            hp = hp % 3;
        }

        answer += hp;

        return answer;
    }
}
