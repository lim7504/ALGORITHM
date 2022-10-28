package 인프런.섹션04_해쉬맵_트리셋_다시풀기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 문제01_학급회장 {

    private static char solution(String str, int n) {
        char result = ' ';
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char s : map.keySet()) {
            Integer cnt = map.get(s);
            if (cnt > max) {
                max = cnt;
                result = s;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.print(solution(str, n));
    }
}
