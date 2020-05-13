package 해쉬.폰번호;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution p = new Solution();
        String[] phone_book = {"12","123","1235","567","88"};
        Boolean result = p.solution(phone_book);
        System.out.println("result = " + result);
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i<phone_book.length-1; i++){
            for(int j=i+1; j<phone_book.length; j++)
                if(phone_book[j].startsWith(phone_book[i]))
                    return false;
        }
        return true;
    }
}
