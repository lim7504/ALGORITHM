package 인프런.섹션03_투포인터_슬라이딩윈도우_다시풀기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 문제01_두배열합치기 {
    private static int[] solution(int[] nArray, int n, int[] mArray, int m) {
        int[] array = new int[n+m];
        int point = 0;
        for (int i : nArray) {
            array[point] = i;
            point++;
        }
        for (int i : mArray) {
            array[point] = i;
            point++;
        }
        for (int i = 0; i < n + m; i++) {
            for (int j = i + 1; j < n + m; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static List<Integer> solution2(int[] nArray, int n, int[] mArray, int m) {
        List<Integer> result = new ArrayList<>();
        int p1=0, p2=0;
        while (p1 < n && p2 < m) {
            if (nArray[p1] < mArray[p2]) {
                result.add(nArray[p1]);
                p1++;
            } else {
                result.add(mArray[p2]);
                p2++;
            }
        }
        while (p1 < n) {
            result.add(nArray[p1]);
            p1++;
        }
        while (p2 < m) {
            result.add(mArray[p2]);
            p2++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] mArray = new int[m];
        for (int i = 0; i < m; i++) {
            mArray[i] = sc.nextInt();
        }
        for (int i : solution2(nArray, n, mArray, m)) {
            System.out.print(i + " ");
        }
    }
}
