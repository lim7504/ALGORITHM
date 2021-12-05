package 프로그래머스.배열.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {2,8,10,21};
        int target = 10;
        int[] result = s.twosum(input, target);
        System.out.println("result = " + Arrays.toString(result));
    }

    public int[] twosum(int[] input, int target){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i] + input[j] == target){
                    list.add(i+1);
                    list.add(j+1);
                }
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
