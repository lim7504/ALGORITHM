package 인프런.섹션04_해쉬맵_트리셋_다시풀기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 문제04_모든아나그램찾기 {

    private static int solution(String str1, String str2) {
        int result = 0;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            if(i >= str2.length()) {
                map1.put(str1.charAt(i - str2.length()), map1.get(str1.charAt(i - str2.length())) - 1);
                if (map1.get(str1.charAt(i - str2.length())) == 0) {
                    map1.remove(str1.charAt(i - str2.length()));
                }
            }
            if(map1.equals(map2)) {
                result++;
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
