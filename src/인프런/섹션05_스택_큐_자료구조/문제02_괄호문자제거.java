package 인프런.섹션05_스택_큐_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 문제02_괄호문자제거 {

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else {
                if(stack.isEmpty()) {
                    result += c;
                }
            }
        }
        return result;
    }

    private static String solution2(String str) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == ')') {
                while(stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution2(str));
    }
}
