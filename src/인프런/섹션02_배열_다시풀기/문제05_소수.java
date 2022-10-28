package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제05_소수 {

    private static int solution(int n) {
        int result=0;
        int[] ch = new int[n+1];
        for (int i = 2; i < n; i++) {
            if(ch[i] == 0) {
                result++;
            }
            for (int j = i; j < n; j = j + i) {
                ch[j] = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }
}
