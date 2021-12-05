package 프로그래머스.정렬.HIndex;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 s =  new Solution2();
        int[] citations = {3,1,0,5,6};
        int solution = s.solution(citations);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}
