package programmers.etc;

public class 공_던지기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3};
        System.out.println(solution(arr,2));
        System.out.println(solution(arr1,9));
        System.out.println(solution(arr2,3));
    }

    public static int solution(int[] numbers, int k) {
        int result = 0;
        int count = 0;
        int index = 0;

        while (k > count) {
            if (index >= numbers.length) {
                index = index % numbers.length;
            }
            result = numbers[index];
            index += 2;
            count++;
        }
        return result;
    }

//     다른 사람의 풀이
//    public static int solution(int[] numbers, int k) {
//        return numbers[((k-1)*2)%numbers.length];
//    }
}
