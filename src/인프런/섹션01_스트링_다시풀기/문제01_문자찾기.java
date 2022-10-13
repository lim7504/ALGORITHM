package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제01_문자찾기 {

    public static int solution(String str, char c) {
        int cnt = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char ch : str.toCharArray()) {
            if(ch == c) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char c = s.next().charAt(0);
        System.out.println(solution(str,c));
    }

}
