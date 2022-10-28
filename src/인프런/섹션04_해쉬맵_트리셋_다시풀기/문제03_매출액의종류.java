package 인프런.섹션04_해쉬맵_트리셋_다시풀기;

import java.util.*;

public class 문제03_매출액의종류 {

    private static List<Integer> solution(int[] array, int n, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            if(i == k-1) {
                result.add(map.keySet().size());
            }
            if(i >= k) {
                map.put(array[i - k], map.get(array[i - k]) - 1);
                if(map.get(array[i-k]) == 0) {
                    map.remove(array[i-k]);
                }
                result.add(map.size());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (Integer i : solution(array, n, k)) {
            System.out.print(i + " ");
        }
    }
}
