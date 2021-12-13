package 인프런.섹션02_배열;

import java.util.Scanner;

public class 문제09_격자판최대합 {

    public static int solution(int cnt, int[][] arr) {
        int result = 0;
        for (int i = 0; i < cnt; i++) {
            int a = 0;
            int b = 0;
            for (int j= 0; j < cnt; j++) {
                a += arr[i][j];
                b += arr[j][i];
            }
            result = Math.max(Math.max(a,b),result);
        }

        int c = 0;
        int d = 0;
        for (int i = 0; i < cnt; i++) {
            c +=arr[i][i];
            d +=arr[cnt-1-i][i];
        }
        result = Math.max(Math.max(c,d), result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] arr = new int[cnt][cnt];
        for (int i = 0; i < cnt; i++) {
            for (int j= 0; j < cnt; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(solution(cnt, arr));
    }
}
