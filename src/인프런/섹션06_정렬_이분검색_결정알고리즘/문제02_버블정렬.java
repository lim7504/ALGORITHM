package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.Scanner;

public class 문제02_버블정렬 {

    private static int[] solution(int n, int[] array) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : solution(n, array)) {
            System.out.print(i + " ");
        }
    }
}
