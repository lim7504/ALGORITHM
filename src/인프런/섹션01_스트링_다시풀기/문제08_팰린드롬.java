package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제08_팰린드롬 {

    // 내가 한것
    private static String solution(String str) {
        str = str.toUpperCase();
        char[] charArray = str.toCharArray();
        int lt = 0, rt = charArray.length -1;
        for(int i=0; i<charArray.length/2; i++) {
            if(!Character.isAlphabetic(str.charAt(i))) {
                continue;
            }
            if(str.charAt(i) != str.charAt(charArray.length-1-i)) {
                return "NO";
            }
        }
        return "YES";
    }

    //강의 내용 1
    private static String solution2(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String temp = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        System.out.println(temp);
        if(str.equals(temp)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(solution(str));
    }

}
