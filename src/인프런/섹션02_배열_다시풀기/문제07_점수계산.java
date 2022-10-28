package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제07_점수계산 {

    private static int solution(int[] array, int n) {
        int point = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] == 1) {
                point++;
                result += point;
            } else {
                point = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(solution(array, n));
    }
}
