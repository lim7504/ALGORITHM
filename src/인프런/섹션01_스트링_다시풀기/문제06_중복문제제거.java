package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제06_중복문제제거 {

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(!answer.toString().contains(String.valueOf(c))) {
                answer.append(c);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solution(str));
    }
}
