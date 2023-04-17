package 인프런.섹션07_DFS_BFS_기초;

import java.util.Scanner;

public class 문제04_피보나치수열 {

    private static int solution(int n) {
        return DFS(n);
    }

    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(DFS(i));
        }
    }
}
