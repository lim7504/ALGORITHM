package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제10_봉우리 {

    private static int solution(int[][] array, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean up = true, down = true, left = true, right = true;
                if (i - 1 >= 0 && array[i - 1][j] >= array[i][j]) {
                    up = false;
                }
                if (i + 1 < n && array[i + 1][j] >= array[i][j]) {
                    down = false;
                }
                if (j - 1 >= 0 && array[i][j - 1] >= array[i][j]) {
                    left = false;
                }
                if (j + 1 < n && array[i][j + 1] >= array[i][j]) {
                    right = false;
                }
                if(up && down && left && right) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(array,n));
    }

}
