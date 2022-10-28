package 인프런.섹션01_스트링_다시풀기;

import java.util.Scanner;

public class 문제10_가장짧은문자거리 {

    private static int[] solution(String s, char t) {
        int[] result=new int[s.length()];
        int dis=1000;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == t) {
                dis=0;
            } else {
                dis++;
            }
            result[i] = dis;
        }
        dis = 1000;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == t) {
                dis=0;
            } else {
                dis++;
            }
            result[i]=Math.min(result[i], dis);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for (int i : solution(s, t)) {
            System.out.print(i + " ");
        }
    }
}
