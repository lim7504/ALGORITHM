package 인프런.섹션02_배열_다시풀기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 문제01_큰수출력하기 {

    private static List<Integer> solution(int[] array, int cnt) {
        List<Integer> result = new ArrayList<>();
        result.add(array[0]);
        for (int i = 0; i < cnt - 1; i++) {
            if (array[i] < array[i + 1]) {
                result.add(array[i + 1]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] array = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = sc.nextInt();
        }
        for (int a : solution(array, cnt)) {
            System.out.print(a + " ");
        }
    }
}
