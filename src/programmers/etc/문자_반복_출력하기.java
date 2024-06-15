package programmers.etc;

public class 문자_반복_출력하기 {
    public static void main(String[] args) {
        System.out.println(solution("hello",3));
    }

    public static String solution(String my_string, int n) {
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }
}
