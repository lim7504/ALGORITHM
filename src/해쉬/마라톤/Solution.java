package 해쉬.마라톤;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Solution m = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = { "stanko", "mislav", "ana"};
        String str = m.solution(participant, completion);

        System.out.println("str = " + str);
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> people = new HashMap<>();

        for (String person : participant) {
            people.put(person, people.getOrDefault(person,0) + 1);
        }

        for (String person : completion) {
            people.put(person, people.getOrDefault(person,0) -1);
        }

        for (String key : people.keySet()) {
            if(people.get(key) >0)
                answer = key;
        }

        return answer;
    }

}
