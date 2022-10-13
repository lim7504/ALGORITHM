package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제03_문장속단어 {

    public static String solution(String str) {
        String result = "";
        String[] array = str.split(" ");
        for(String temp : array) {
            if(result.length() < temp.length()) {
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(solution(str));
    }
}
