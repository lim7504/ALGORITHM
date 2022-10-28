package 인프런.섹션04_해쉬맵_트리셋_다시풀기;

import java.util.*;

public class 문제05_K번째큰수 {

    private static int solution(int[] array, int n, int k) {
        int result=-1;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tSet.add(array[i] + array[j] + array[l]);
                }
            }
        }
        int cnt=0;
        for(int x : tSet) {
            cnt++;
            if(cnt==k) {
                return x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(solution(array, n, k));
    }
}
