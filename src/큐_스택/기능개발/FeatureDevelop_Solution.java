package 큐_스택.기능개발;

import java.util.LinkedList;
import java.util.Queue;

public class FeatureDevelop_Solution {

    class Feature {
        int progress;
        int speed;

        Feature(int progress, int speed){
            this.progress = progress;
            this.speed = speed;
        }

        void develop(){
            this.progress += speed;
        }

        boolean checkDevelopSuccess() {
            if(this.progress >= 100)
                return true;
            else
                return false;
        }

    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new LinkedList<Integer>();
        Queue<Feature> features = new LinkedList<>();

        for (int i = 0; i<progresses.length; i ++) {
            features.add(new Feature(progresses[i], speeds[i]));
        }

        while(!features.isEmpty()) {

            if(features.peek().checkDevelopSuccess()){
                int answer_count = 0;
                while (!features.isEmpty() && features.peek().checkDevelopSuccess()) {
                    features.poll();
                    answer_count++;
                }
                answer.add(answer_count);
            }

            for (Feature feature : features) {
                feature.develop();
            }

        }
        int[] arr = answer.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
