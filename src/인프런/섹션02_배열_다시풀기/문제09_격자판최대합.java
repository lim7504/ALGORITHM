package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제09_격자판최대합 {

    private static int solution(int[][] array, int n) {
        int result = 0, kSum = 0, tSum = 0;
        for (int i = 0; i < n; i++) {
            int iSum = 0, jSum = 0;
            for (int j = 0; j < n; j++) {
                jSum += array[i][j];
                iSum += array[j][i];
                if(i==j) {
                    kSum += array[i][j];
                }
                if(i+j==4) {
                    tSum += array[i][j];
                }
            }
            result = Math.max(result, jSum);
            result = Math.max(result, iSum);
        }
        result = Math.max(result, kSum);
        result = Math.max(result, tSum);
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
        System.out.print(solution(array, n));
    }
}
