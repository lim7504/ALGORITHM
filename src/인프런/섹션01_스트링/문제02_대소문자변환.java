package 인프런.섹션01_스트링;

import java.util.Scanner;

public class 문제02_대소문자변환 {

    public static String solution(String str) {
        String answer = null;
        StringBuilder sb = new StringBuilder("");
        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        System.out.println(solution(input1));
    }
}
