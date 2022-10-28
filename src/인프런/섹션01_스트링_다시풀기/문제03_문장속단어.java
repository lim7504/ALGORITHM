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

    public static String solution2(String str) {
        String answer = "";
        int pos;
        while((pos=str.indexOf(' '))!=-1) {
            String temp = str.substring(0, pos);
            if(answer.length() < temp.length()) {
                answer = temp;
            }
            str = str.substring(pos+1);
        }
        if(answer.length() < str.length()) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(solution2(str));
    }
}
