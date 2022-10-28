package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.Scanner;

public class 문제04_가장최근에사용한 {

    private static int[] solution(int s, int[] sArray, int n, int[] nArray) {
        for (int i = 0; i < n; i++) {
            int hitNum = -1, jInit;
            for (int j = 0; j < s; j++) {
                if(sArray[j] == nArray[i]) {
                    hitNum = j;
                    break;
                }
            }
            if(hitNum != -1) {
                jInit = hitNum;
            } else {
                jInit = s - 1;
            }
            for (int j = jInit; j > 0; j--) {
                sArray[j] = sArray[j - 1];
            }
            sArray[0] = nArray[i];
        }

        return sArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] sArray = new int[s];
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = sc.nextInt();
        }


    }
}
