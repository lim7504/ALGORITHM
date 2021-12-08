package 인프런.섹션02_배열;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/08
 */

/*
큰 수 출력하기

설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

예시 입력 1
6
7 3 9 5 6 12

예시 출력 1
7 9 6 12
 */
public class 문제01_큰수출력하기 {

    public static List<Integer> solution(int cnt, int[] array) {
        List<Integer> result = new ArrayList<>();
        result.add(array[0]);
        for (int i = 1; i < cnt; i++) {
            if(array[i-1] < array[i]) {
                result.add(array[i]);
            }
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