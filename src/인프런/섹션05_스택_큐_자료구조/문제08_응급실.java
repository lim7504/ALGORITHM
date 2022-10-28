package 인프런.섹션05_스택_큐_자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 문제08_응급실 {

    static class P {
        int a;
        int b;

        public P(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    private static int solution(int n, int[] array, int m) {
        Queue<P> queue = new LinkedList<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            queue.offer(new P(i, array[i]));
        }
        while (!queue.isEmpty()) {
            P temp = queue.poll();
            for (P p : queue) {
                if(p.b > temp.b) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null) {
                cnt++;
                if (temp.a == m) {
                    return cnt;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(solution(n, array, m));
    }
}
