package 인프런.섹션01_스트링;

import java.util.Scanner;

/*
가장 짧은 문자거리

설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

예시 입력 1
teachermode e

예시 출력 1
1 0 1 2 1 0 1 2 2 1 0
 */
public class 문제10_가장짧은문자거리 {

    public static int[] solution(String str, char c) {
        int[] array = new int[str.length()];
        int point = 1000;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                point = 0;
                array[i] = point;
            } else {
                array[i] = ++point;
            }
        }

        point = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == c) {
                point = 0;
            } else {
                if(array[i] > point + 1) {
                    array[i] = ++point;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : solution(str, c)){
            System.out.print(x+" ");
        }
    }

}
