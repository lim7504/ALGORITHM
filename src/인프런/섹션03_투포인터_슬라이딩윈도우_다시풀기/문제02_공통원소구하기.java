package 인프런.섹션03_투포인터_슬라이딩윈도우_다시풀기;

import java.util.*;

public class 문제02_공통원소구하기 {

    private static List<Integer> solution(int[] nArray, int n, int[] mArray, int m) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(nArray[i] > nArray[j]) {
                    int temp = nArray[i];
                    nArray[i] = nArray[j];
                    nArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (mArray[i] > mArray[j]) {
                    int temp = mArray[i];
                    mArray[i] = mArray[j];
                    mArray[j] = temp;
                }
            }
        }
        int p1=0, p2=0;
        while (p1 < n && p2 < m) {
            if(nArray[p1] < mArray[p2]) {
                p1++;
            } else if(nArray[p1] > mArray[p2]) {
                p2++;
            } else {
                result.add(nArray[p1]);
                p1++;
                p2++;
            }
        }

        return result;
    }

    private static List<Integer> solution2(int[] nArray, int n, int[] mArray, int m) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nArray);
        Arrays.sort(mArray);
        int p1=0, p2=0;
        while (p1 < n && p2 < m) {
            if(nArray[p1] < mArray[p2]) {
                p1++;
            } else if(nArray[p1] > mArray[p2]) {
                p2++;
            } else {
                result.add(nArray[p1]);
                p1++;
                p2++;
            }
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
