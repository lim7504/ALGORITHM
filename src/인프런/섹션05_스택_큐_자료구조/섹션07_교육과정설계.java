package 인프런.섹션05_스택_큐_자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섹션07_교육과정설계 {

    private static String solution(String str1, String str2) {
        String result = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : str1.toCharArray()) {
            queue.offer(c);
        }
        for (char c : str2.toCharArray()) {
            if(queue.contains(c)) {
                if(queue.peek() != c) {
                    result = "NO";
                } else {
                    queue.poll();
                }
            }
        }
        if(!queue.isEmpty()) {
            result = "NO";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.print(solution(str1, str2));
    }
}
