package 프로그래머스.완전탐색.소수찾기;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        String numbers = "17";
        int solution = s.solution(numbers);
        System.out.println("solution = " + solution);
    }

    public int solution(String numbers) {
        int answer = 0;

        for(int i = 0; i < numbers.length(); i++){

            int number = numbers.charAt(i);
            if(check(number))
                answer++;
        }

        return answer;
    }

    public boolean check(int number){

        boolean isPrimeNumber = true;

        if(number == 2 || number == 3)
            return true;

        for (int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }

        return isPrimeNumber;
    }

}
