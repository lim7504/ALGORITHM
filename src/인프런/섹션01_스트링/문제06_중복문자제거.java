package 인프런.섹션01_스트링;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/06
 */

public class 문제06_중복문자제거 {

    public static String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int charFirstIndex = String.valueOf(charArray).indexOf(charArray[i]);
            if(i == charFirstIndex)
                answer += charArray[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}