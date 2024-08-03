package programmers.etc;

public class 모음_제거 {

    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }

    public static String solution(String my_string) {
        // a, e, i, o, u 제외
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 다른 정답
//    public static String solution2(String my_string) {
//        return my_string.replaceAll("[aeiou]", "");
//    }

}
