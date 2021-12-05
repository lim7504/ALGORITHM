package 인프런.섹션01_스트링;

import java.util.Scanner;

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
