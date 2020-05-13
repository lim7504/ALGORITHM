package 배열.findallanagram;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagram {
    public static void main(String[] args) {
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        int patSum = 0;
        int patCount = 0;
        List<Integer> result = new ArrayList<>();

        patCount = pat.toCharArray().length;
        for(char s : pat.toCharArray())
            patSum += s;

        for(int i = 0; i <= txt.toCharArray().length - patCount; i++) {
            int txtSum = 0;
            for (int j = i; j < i + patCount; j++) {
                txtSum += txt.toCharArray()[j];
            }
            if(txtSum == patSum)
                result.add(i);
        }

        result.forEach(integer -> System.out.println("integer = " + integer));
    }
}
