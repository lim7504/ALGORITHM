package 인프런.섹션01_스트링;

import java.util.Scanner;

public class 문제01_문자찾기 {

    public static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (char ch : str.toCharArray()) {
            if(ch == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        char input2 = scanner.next().charAt(0);
        System.out.println(solution(input1, input2));
    }

}
