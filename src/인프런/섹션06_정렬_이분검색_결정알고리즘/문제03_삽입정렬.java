package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.Scanner;

public class 문제03_삽입정렬 {

    private static int[] solution(int n, int[] array) {
        for (int i = 1; i < n; i++) {
            int temp = array[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = temp;
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
