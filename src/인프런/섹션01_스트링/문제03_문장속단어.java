package 인프런.섹션01_스트링;

import java.util.Scanner;

public class 문제03_문장속단어 {

    public static String solution(String str) {
        String answer = null;
        int maxLength = 0;
        for (String s : str.split(" ")) {
            if(maxLength < s.length()) {
                answer = s;
                maxLength = s.length();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.println(solution(input1));
    }

}
