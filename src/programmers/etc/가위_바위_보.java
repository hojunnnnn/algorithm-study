package programmers.etc;

public class 가위_바위_보 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        char[] chars = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars) {
            int i = c == '2' ? 0 : c == '0' ? 5 : 2;
            sb.append(i);
        }
        return sb.toString();
    }
}
