package programmers.etc;

public class 중앙_값_구하기 {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        int[] array1 = {9,-1,0};

        System.out.println(solution(array));
        System.out.println(solution(array1));
    }
    public static int solution(int[] array) {
        int answers = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        answers = array[array.length / 2];
        return answers;
    }
}
