package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제09_숫자만추출 {

    public static int solution(String str) {
        StringBuilder temp = new StringBuilder();
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                temp.append(c);
            }
        }
        return Integer.parseInt(temp.toString());
    }

    public static int solution2(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 58) {
                result = result * 10 + (c - 48);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solution2(str));
    }
}
