package 프로그래머스.완전탐색.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answers = {1,2,3,4,5};
        int[] solution = s.solution(answers);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;
        int max = 0;

        for (int i = 0; i < answers.length; i++) {

            if(answers[i] == first[i % 5])
                firstCnt++;

            if(answers[i] == second[i % 8])
                secondCnt++;

            if(answers[i] == third[i % 10])
                thirdCnt++;

            max = Math.max(max, Math.max(firstCnt, Math.max(secondCnt, thirdCnt)));
        }
        List<Integer> list = new ArrayList<>();
        if(max == firstCnt)
            list.add(1);
        if(max == secondCnt)
            list.add(2);
        if(max == thirdCnt)
            list.add(3);

        answer = list.stream().mapToInt(i->i).sorted().toArray();

        return answer;
    }
}
