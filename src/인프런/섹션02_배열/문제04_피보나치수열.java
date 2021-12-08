package 인프런.섹션02_배열;

import java.util.*;

/**
 * @author jslim
 * @version 0.1.0
 * @since 2021/12/08
 */

/*
피보나치 수열

설명
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

출력
첫 줄에 피보나치 수열을 출력합니다.

예시 입력 1
10

예시 출력 1
1 1 2 3 5 8 13 21 34 55
 */
public class 문제04_피보나치수열 {

    public static List<Integer> solution(int cnt) {
        List<Integer> result = new ArrayList<>();
        int a = 1;
        int b = 1;
        int c = 0;
        result.add(a);
        result.add(b);
        for (int i = 2; i < cnt; i++) {
            c = a + b;
            a = b;
            b = c;
            result.add(c);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for(int x : solution(cnt)){
            System.out.print(x+" ");
        }
    }
}