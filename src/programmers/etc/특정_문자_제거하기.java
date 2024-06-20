package programmers.etc;

public class 특정_문자_제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
//         return my_string.replace(letter,"");
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            if (c != letter.charAt(0)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
