package 인프런.섹션02_배열_다시풀기;

import java.util.Scanner;

public class 문제03_가위바위보 {

    private static String[] solution(int[] aArray, int[] bArray, int cnt) {
        String[] strArray = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            if (aArray[i] == 1 && bArray[i] == 2) {
                strArray[i] = "B";
            } else if (aArray[i] == 1 && bArray[i] == 3) {
                strArray[i] = "A";
            } else if (aArray[i] == 2 && bArray[i] == 3) {
                strArray[i] = "B";
            } else if (aArray[i] == 2 && bArray[i] == 1) {
                strArray[i] = "A";
            } else if (aArray[i] == 3 && bArray[i] == 1) {
                strArray[i] = "B";
            } else if (aArray[i] == 3 && bArray[i] == 2) {
                strArray[i] = "A";
            } else {
                strArray[i] = "D";
            }
        }
        return strArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] aArray = new int[cnt];
        int[] bArray = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            aArray[i] = sc.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            bArray[i] = sc.nextInt();
        }
        for (String s : solution(aArray, bArray, cnt)) {
            System.out.println(s);
        }
    }
}
