package 인프런.섹션01_스트링;

import java.util.Scanner;

/*
단어 뒤집기

설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

예시 입력 1
3
good
Time
Big

예시 출력 1
doog
emiT
giB
 */
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
