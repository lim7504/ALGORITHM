package 큐_스택.기능개발;

public class Main {
    public static void main(String[] args) {

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        FeatureDevelop_Solution solution = new FeatureDevelop_Solution();
        int[] answer = solution.solution(progresses, speeds);

        for (int i : answer) {
            System.out.println("i = " + i);
        }

    }


}

