package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제12_멘토링 {
    private static int solution(int[][] array, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(array, n, m));
    }
}
