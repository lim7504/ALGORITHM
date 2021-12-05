package 프로그래머스.정렬.HIndex;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution s =  new Solution();
        int[] citations = {3,1,0,5,6};
        int solution = s.solution(citations);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] citations) {
        int answer = 0;
        boolean flag = true;
        Arrays.sort(citations);
        answer = citations.length + 1;

        //0 1 3 5 6
        while (flag) {
            answer--;
            for (int i = citations.length - 1; i >= 0; i--) {
                if(citations[i] >= answer
                        && answer <= citations.length - i) {
                    flag = false;
                    break;
                }
            }
        }
        return answer;
    }
}
