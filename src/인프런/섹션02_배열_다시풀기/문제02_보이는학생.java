package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제02_보이는학생 {

    private static int solution(int[] array, int cnt) {
        int max = 0;
        int result = 0;
        for (int i : array) {
            if (max < i) {
                result++;
                max = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] array = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(solution(array, cnt));

    }
}
