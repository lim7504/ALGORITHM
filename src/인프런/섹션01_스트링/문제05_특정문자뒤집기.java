package 인프런.섹션01_스트링;

import java.util.Scanner;

/*
특정 문자 뒤집기

설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

예시 입력 1
a#b!GE*T@S

예시 출력 1
S#T!EG*b@a
 */
public class 문제05_특정문자뒤집기 {

    public static String solution(String str) {
        String answer = null;
        char[] charArray = str.toCharArray();
        int lt = 0, rt = charArray.length - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArray);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.println(solution(input1));
    }
}
