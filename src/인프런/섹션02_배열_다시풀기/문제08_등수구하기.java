package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제08_등수구하기 {

    private static int[] solution(int[] array, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int grade = 1;
            for (int j = 0; j < n; j++) {
                if(array[i] < array[j]) {
                    ++grade;
                }
            }
            result[i] = grade;
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
        for (int i : solution(array, n)) {
            System.out.print(i + " ");
        }

    }
}
