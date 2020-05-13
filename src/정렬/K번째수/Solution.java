package 정렬.K번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = s.solution(array, commands);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i<commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int point = commands[i][2] - 1;
            int k = 0;

            int[] temp = new int[end - start + 1];
            for (int j = 0; j < array.length; j++) {
                if(j < start || j > end)
                    continue;
                temp[k++] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[point];
        }

        return answer;
    }
}
