package 인프런.섹션03_투포인터_슬라이딩윈도우_다시풀기;

import java.util.Scanner;

public class 문제05_연속된자연수의합 {

    private static int solution(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if(sum == n) {
                    result++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return result;
    }

    private static int solution2(int n) {
        int result = 0, m = n/2 + 1;
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i] = i + 1;
        }
        int lt = 0, rt = 0;
        int sum = 0;
        while (rt < m) {
            sum += array[rt];
            rt++;
            if(sum == n) {
                result++;
            }
            while(sum >= n) {
                sum -= array[lt];
                lt++;
                if(sum == n) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution2(n));
    }
}
