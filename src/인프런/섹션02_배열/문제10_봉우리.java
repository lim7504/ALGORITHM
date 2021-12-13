package 인프런.섹션02_배열;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/14
 */

public class 문제10_봉우리 {

    public static int solution(int cnt, int[][] arr) {
        int result = 0;
        for (int i = 0; i < cnt; i++) {
            for (int j= 0; j < cnt; j++) {
                if(( i-1 < 0 || arr[i][j] > arr[i-1][j])
                        && (j+1 == cnt || arr[i][j] > arr[i][j+1])
                        && (i+1 == cnt || arr[i][j] > arr[i+1][j])
                        && (j-1 < 0 || arr[i][j] > arr[i][j-1])) {
                    result++;
                }
            }
        }
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