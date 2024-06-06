package programmers.etc;

public class 최빈_값_구하기 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        int[] array1 = {1, 1, 2, 2};
        int[] array2 = {1};

        System.out.println(solution(array));
        System.out.println(solution(array1));
        System.out.println(solution(array2));
    }

    public static int solution(int[] array) {
        int answer = 0;
        int maxNum = 0;
        int indexNum = 0;

        // 1. 최댓값 구하기
        for (int i : array) {
            if (i > maxNum)
                maxNum = i;
        }

        // 2. 최댓값만큼 배열 크기 설정
        int[] indexArr = new int[maxNum + 1];

        // 3. index에 count
        for (int i : array) {
            indexArr[i]++;
        }

        // 4. 최빈 값 찾기
        for (int i = 0; i < indexArr.length; i++) {
            if (indexNum < indexArr[i]) {
                indexNum = indexArr[i];
                answer = i;
            }
        }

        // 5. 최빈 값 중복 여부 확인
        int cnt = 0;
        for (int i : indexArr) {
            if(i == indexNum)
                cnt++;
        }
        return cnt > 1 ? -1 : answer;
    }
}