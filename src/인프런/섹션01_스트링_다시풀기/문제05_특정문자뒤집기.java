package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제05_특정문자뒤집기 {

    private static String solution(String str) {
        char[] charArray = str.toCharArray();
        int lt = 0, rt = charArray.length -1;
        while(lt<rt) {
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
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(solution(str));
    }

}
