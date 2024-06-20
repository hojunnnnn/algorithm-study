package programmers.etc;

public class 외계행성의_나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));

    }

    public static String solution(int age) {
        char[] chars = {'a','b','c','d','e','f','g','h','i','j'};
        StringBuilder sb = new StringBuilder();

        for (char c : String.valueOf(age).toCharArray()) {
            sb.append(chars[c - '0']);
        }

        return sb.toString();
    }
}
