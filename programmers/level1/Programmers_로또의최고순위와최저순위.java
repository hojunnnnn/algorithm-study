class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int zeroCnt = 0;
        int lowCnt = 0;
        for(int i = 0; i < lottos.length; i++) {
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    lowCnt++;
                } 
            }
            if(lottos[i] == 0) {
                zeroCnt++;
            }
        }
        int highCnt = zeroCnt + lowCnt;
        return new int[] {rank[highCnt], rank[lowCnt]};
    }
}