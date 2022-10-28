package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.*;

public class 문제05_중복확인 {

    private static String solution(int n, int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        if (array.length == set.size()) {
            return "U";
        } else {
            return "D";
        }
    }

    private static String solution2(int n, int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++) {
            if (array[i] == array[i + 1]) {
                return "D";
            }
        }
        return "U";
    }

    private static String solution3(int n, int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])) {
                return "D";
            } else {
                map.put(array[i], 1);
            }
        }
        return "U";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(solution3(n, array));
    }
}
