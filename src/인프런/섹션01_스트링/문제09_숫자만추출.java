package 인프런.섹션01_스트링;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/06
 */

public class 문제09_숫자만추출 {

    public static int solution(String str) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }
        answer = Integer.parseInt(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}