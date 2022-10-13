package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제02_대소문자_변환 {

    public static String solution(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solution(str));
    }

}
