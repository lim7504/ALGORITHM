package 해쉬.위장_해쉬문제;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int solution = s.solution(clothes);
        System.out.println("solution = " + solution);
    }

    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer> map = new HashMap<>();
        for (String[] clothe : clothes)
            map.put(clothe[1],map.getOrDefault(clothe[1],0) + 1);

        for (String key : map.keySet()) {
            answer = answer * (map.get(key) + 1);
        }

        return answer - 1;
    }
}
