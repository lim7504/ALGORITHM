package 인프런.섹션01_스트링;

import java.util.Scanner;

public class 문제04_단어뒤집기 {

    public static String[] solution(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = new StringBuilder(strArray[i]).reverse().toString();
        }
        return strArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        String[] strArray = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            strArray[i] = scanner.next();
        }

        String[] solution = solution(strArray);
        for (String str : solution) {
            System.out.println(str);
        }
    }
}
