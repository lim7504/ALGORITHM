package 인프런.섹션01_스트링_다시풀기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 문제04_단어뒤집기 {

    //내가 한것
    private static List<String> solution(String[] strArray, int n) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            StringBuilder temp = new StringBuilder();
            for(char c : strArray[i].toCharArray()) {
                temp.insert(0, String.valueOf(c));
            }
            answer.add(temp.toString());
        }
        return answer;
    }

    //강의 안내 1
    private static List<String> solution2(String[] strArray, int n) {
        List<String> answer = new ArrayList<>();
        for(String str : strArray) {
            answer.add(new StringBuilder(str).reverse().toString());
        }
        return answer;
    }

    //강의 안내 2
    private static List<String> solution3(String[] strArray, int n) {
        List<String> answer = new ArrayList<>();
        for(String s : strArray) {
            char[] charArray = s.toCharArray();
            int lt = 0, rt = charArray.length - 1;
            while(lt<rt) {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(charArray));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] strArray = new String[n];
        for(int i=0; i<n; i++) {
            strArray[i] = s.next();
        }
        for(String str : solution3(strArray, n)) {
            System.out.println(str);
        }
    }
}
