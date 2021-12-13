package 인프런.섹션02_배열;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/14
 */

public class 문제08_등수구하기 {

    public static List<Integer> solution(int cnt, int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    rank += 1;
                }
            }
            result.add(rank);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : solution(cnt, arr)){
            System.out.print(x+" ");
        }
    }
}