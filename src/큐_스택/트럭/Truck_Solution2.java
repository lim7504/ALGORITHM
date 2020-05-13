package 큐_스택.트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_Solution2 {
    class Truck{

        private int truck_weight;
        private int run_length;

        Truck(int truct_weight){
            this.truck_weight = truct_weight;
            this.run_length = 0;
        }

        int getTruck_weight(){
            return this.truck_weight;
        }

        int getRun_length(){
            return this.run_length;
        }

        void run(){
            this.run_length++;
        }

        @Override
        public String toString() {
            return "" + truck_weight;
        }
    }

    class Bridge{
        Queue<Truck> queue = new LinkedList<>();
        int bridge_length;
        int use_weight;
        int weight;

        Bridge(int bridge_length, int weight){
            this.bridge_length = bridge_length;
            this.weight = weight;
        }

        void addTruck(Truck truck){
            queue.add(truck);
            use_weight += truck.getTruck_weight();
            System.out.println("입장 truck = " + truck);
        }

        void Run(){

            for (Truck truck : queue) {
                truck.run();
            }

            if(checkPollTruck())
                pollTruck();
        }

        boolean checkPollTruck(){
            if(!queue.isEmpty() && queue.peek().getRun_length() >= this.bridge_length)
                return true;
            else
                return false;
        }

        void pollTruck(){
            Truck truck = queue.poll();
            use_weight -= truck.getTruck_weight();
            System.out.println("퇴장 truck = " + truck);
        }


        boolean checkAddTruck(Truck addTruck){
            if(weight >= use_weight + addTruck.getTruck_weight())
                return true;
            else
                return false;
        }

        int getTruckCount(){
            return this.queue.size();
        }

    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Bridge bridge = new Bridge(bridge_length, weight);
        Queue<Truck> waitQueue = new LinkedList<>();
        int sec = 0;

        for (int truck_weight : truck_weights) {
            waitQueue.add(new Truck(truck_weight));
        }

        while(!waitQueue.isEmpty() || bridge.getTruckCount() >= 1){

            sec++;
            System.out.println("sec = " + sec);

            bridge.Run();

            if(!waitQueue.isEmpty() && bridge.checkAddTruck(waitQueue.peek()))
                bridge.addTruck(waitQueue.poll());
        }

        return sec;
    }
}
