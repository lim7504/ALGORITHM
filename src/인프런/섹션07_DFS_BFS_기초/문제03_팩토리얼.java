package 인프런.섹션07_DFS_BFS_기초;

import java.util.Scanner;

public class 문제03_팩토리얼 {

    private static int solution(int n) {
        return DFS(n);
    }

    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        }
        return DFS(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
