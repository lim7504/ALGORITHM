package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 문제06_장난꾸러기 {

    private static List<Integer> solution(int n, int[] array) {
        List<Integer> result = new ArrayList<>();
        int[] copy = array.clone();
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            if (array[i] != copy[i]) {
                result.add(i + 1);
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
        for (int i : solution(n, array)) {
            System.out.print(i + " ");
        }
    }
}
