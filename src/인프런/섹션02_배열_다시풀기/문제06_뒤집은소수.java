package 인프런.섹션02_배열_다시풀기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 문제06_뒤집은소수 {

    private static List<Integer> solution(int[] array, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            int temp = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            boolean isPrime = true;
            for (int j = 2; j < temp; j++) {
                if (temp % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(temp != 1 && isPrime) {
                result.add(temp);
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
        for (int i : solution(array, n)) {
            System.out.print(i + " ");
        }
    }
}
