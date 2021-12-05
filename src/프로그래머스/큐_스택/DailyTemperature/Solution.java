package 프로그래머스.큐_스택.DailyTemperature;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] solution = s.solution(nums);
        System.out.println("solution = " + Arrays.toString(solution));
    }


    public int[] solution(int[] nums){
        int[] result = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while(!stack.isEmpty()&& nums[stack.peek()] < nums[i]){

                int index = stack.pop();
                result[index] = i - index;
            }

            stack.push(i);
        }


        return result;
    }
}
