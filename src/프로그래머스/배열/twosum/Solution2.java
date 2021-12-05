package 프로그래머스.배열.twosum;

import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] input = {0,2,8,10,21};
        int target = 10;
        int[] result = s.twosum(input, target);
        System.out.println("result = " + Arrays.toString(result));
    }

    public int[] twosum(int[] array, int target){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                list.add(map.get(array[i]) + 1);
                list.add(i + 1);
            }else{
                map.put(target - array[i], i);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
