package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제07_회문문자열 {

    //내가 푼것
    private static String solution(String str) {
        str = str.toUpperCase();
        int lt = 0, rt = str.length() -1;
        char[] charArray = str.toCharArray();
        while(lt<rt) {
            if(charArray[lt] != charArray[rt]) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }

    // 강의 안내 1
    public static String solution2(String str) {
        str = str.toUpperCase();
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() -1 -i)) {
                return "NO";
            }
        }
        return "YES";
    }

    //강의 안내 2
    public static String solution3(String str) {
        if(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solution3(str));
    }
}
