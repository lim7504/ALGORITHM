package 인프런.섹션05_스택_큐_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 문제01_올바른괄호 {

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }

}
