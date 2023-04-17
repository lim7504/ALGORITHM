package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 문제09_뮤직비디오 {

    private static int count(int[] array, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : array) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    private static int solution(int n, int m, int[] array) {
        int result = 0;
        int lt = Arrays.stream(array).max().getAsInt();
        int rt = Arrays.stream(array).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(array, mid) <= m) {
                result = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = sc.nextInt();
//        }
//        System.out.print(solution(n, m, array));

        DecimalFormat myFormatter = new DecimalFormat("#,###");
        String format = myFormatter.format(100000000);
        System.out.println(format);


        List<String> good = new ArrayList<>();

//        List <?>bad = good;
//// warning: unchecked call to add(E) as a member of the raw type List
//        bad.add();
//        for (String str : good) {
//            System.out.println(str);
//        }
    }

}


