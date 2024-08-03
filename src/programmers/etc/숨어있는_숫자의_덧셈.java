package programmers.etc;

public class 숨어있는_숫자의_덧셈 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-z]", "");
        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.charAt(i) - '0';
        }
        return answer;
    }
}
