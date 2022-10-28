package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제12_암호 {

    private static String solution(String str, int cnt) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            String temp = str.substring(0,7);
            str = str.substring(7);
            StringBuilder ask = new StringBuilder();
            for (char c : temp.toCharArray()) {
                if (c == '#') {
                    ask.append("1");
                } else {
                    ask.append("0");
                }
            }
            result.append((char)Integer.parseInt(ask.toString(), 2));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(str, cnt));
    }

}
