package 인프런.섹션01_스트링;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/06
 */

/*
중복문자제거

설명
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.

예시 입력 1
ksekkset

예시 출력 1
kset
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