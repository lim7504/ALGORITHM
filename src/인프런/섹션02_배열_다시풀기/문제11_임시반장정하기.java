package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제11_임시반장정하기 {

    private static int solution(int[][] array, int n) {
        int result = 0, max = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if(array[i][k] == array[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max=cnt;
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(array, n));
    }
}
