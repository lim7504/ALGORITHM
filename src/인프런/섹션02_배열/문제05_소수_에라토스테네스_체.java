package 인프런.섹션02_배열;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/08
 */

/*
소수(에라토스테네스 체)

설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

출력
첫 줄에 소수의 개수를 출력합니다.

예시 입력 1
20

예시 출력 1
8
 */
public class 문제05_소수_에라토스테네스_체 {

    public static Integer solution(int cnt) {
        int result = 0;
        int[] array = new int[cnt];
        for (int i = 2; i < cnt; i++) {
            if(array[i] == 0) {
                result++;
                for (int j = i; j < cnt; j = j + i) {
                    array[j] = 1;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        System.out.print(solution(cnt));
    }
}