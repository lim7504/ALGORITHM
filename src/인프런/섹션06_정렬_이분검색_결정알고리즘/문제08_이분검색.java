package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 문제08_이분검색 {

    private static int solution(int n, int m, int[] array) {
        int result = 0;
        int lt = 0, rt = n - 1;
        Arrays.sort(array);
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (array[mid] == m) {
                result = mid + 1;
                break;
            }
            if (array[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(solution(n, m, array));
    }

}
