package programmers.etc;

import java.util.Arrays;
import java.util.HashMap;

public class 진료_순서_정하기 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        int[] emergency1 = {1,2,3,4,5,6,7};
        int[] emergency2 = {30,10,23,6,100};
        System.out.println(Arrays.toString(solution(emergency)));
        System.out.println(Arrays.toString(solution(emergency1)));
        System.out.println(Arrays.toString(solution(emergency2)));

    }

    public static int[] solution(int[] emergency) {
        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;
        int length = emergency.length;
        for (int i = length -1; i >= 0; i--) {
            rankMap.put(sortedEmergency[i], rank++);
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = rankMap.get(emergency[i]);
        }

        return result;
    }
}
