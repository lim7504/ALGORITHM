package 프로그래머스.힙.더맵게;

import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int solution = s.solution(scoville, 7);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville)
            pq.add(i);

        while (pq.peek() < K){

            if(pq.size() == 1) {
                answer = -1;
                break;
            }
            else{
                int first = pq.poll();
                int second = pq.poll();
                int cal = first + (second * 2);
                pq.add(cal);
                answer++;
            }

        }

        return answer;
    }
}
