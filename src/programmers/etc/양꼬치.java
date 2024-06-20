package programmers.etc;

public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(3, 7));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        int service = n/10;
        return (n * 12000) + ((k-service) * 2000);
    }
}
