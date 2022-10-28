package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.Scanner;

public class 문제01_선택정렬 {

    private static int[] solution(int n, int[] array) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
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
