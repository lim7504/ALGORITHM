package 인프런.섹션03_투포인터_슬라이딩윈도우_다시풀기;

import java.util.Scanner;

public class 문제03_최대매출 {

    private static int solution(int[] array, int n, int m) {
        int result = 0;
        int sum = 0;
        for(int i=0; i<m; i++) {
            sum += array[i];
        }
        result = sum;
        for (int i = m; i < n; i++) {
            sum += (array[i] - array[i-m]);
            result = Math.max(sum, result);
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
        System.out.print(solution(array, n, m));
    }
}
