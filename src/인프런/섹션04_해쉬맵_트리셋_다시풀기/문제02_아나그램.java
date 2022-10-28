package 인프런.섹션04_해쉬맵_트리셋_다시풀기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 문제02_아나그램 {

    private static String solution(String str1, String str2) {
        String result = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for(char c  : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c  : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (char c : map.keySet()) {
            if(map.get(c) != 0) {
                result = "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(solution(str1, str2));
    }
}
