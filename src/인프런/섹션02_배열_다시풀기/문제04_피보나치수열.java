package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제04_피보나치수열 {

    private static int[] solution(int n) {
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i : solution(n)) {
            System.out.print(i + " ");
        }
    }
}
