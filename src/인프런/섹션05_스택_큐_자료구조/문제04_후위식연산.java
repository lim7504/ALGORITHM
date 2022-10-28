package 인프런.섹션05_스택_큐_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 문제04_후위식연산 {

    private static int solution(String str) {
        int a = 0;
        int b = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(Integer.parseInt(String.valueOf(c)));
            } else {
                b = stack.pop();
                a = stack.pop();
                switch(c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }
}
