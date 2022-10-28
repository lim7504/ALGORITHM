package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제11_문자열압축 {

    private static String solution(String s) {
        int cnt = 1;
        String result = "";
        s = s + " ";
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                result += s.charAt(i);
                if(cnt > 1) {
                    result += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
