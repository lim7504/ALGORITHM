package 프로그래머스.정렬.가장큰수;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {0,0,0};
        String solution = s.solution(numbers);
        System.out.println("solution = " + solution);
    }


    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            arr[i] = String.valueOf(numbers[i]);

        Arrays.sort(arr,(o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]);

        return sb.toString();
    }

}
