package 인프런.섹션01_스트링;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/06
 */

public class 문제07_회문문자열 {

    public static String solution(String str) {
        String answer = "";
        if(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}