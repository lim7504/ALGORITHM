package 인프런.섹션05_스택_큐_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 문제05_쇠막대기 {

    private static int solution(String str) {
        Stack<Character> stack = new Stack<>();
        int result = 0;
        char beforeChar = ' ';
        for (char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(beforeChar == '(') {
                    stack.pop();
                    result += stack.size();
                } else {
                    stack.pop();
                    result += 1;
                }
            }
            beforeChar = c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }
}
