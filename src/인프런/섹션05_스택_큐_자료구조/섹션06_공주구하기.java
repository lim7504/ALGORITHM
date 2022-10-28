package 인프런.섹션05_스택_큐_자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섹션06_공주구하기 {

    private static int solution(int n, int k) {
        int result = 0;
        int cnt = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() != 1) {
            int i = queue.poll();
            cnt++;
            if (cnt % k != 0) {
                queue.offer(i);
            }
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(solution(n, k));

    }
}
