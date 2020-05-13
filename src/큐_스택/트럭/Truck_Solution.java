package 큐_스택.트럭;

import java.util.ArrayDeque;
import java.util.Queue;

class Truck_Solution {
    class Truck{

        private int truck_weight;

        Truck(int truct_weight){
            this.truck_weight = truct_weight;
        }

        int getTruck_weight(){
            return this.truck_weight;
        }

        @Override
        public String toString() {
            return "" + truck_weight;
        }
    }

    class Bridge{
        Truck[] bridge;
        int bridge_length;
        int use_weight;
        int weight;
        int truck_count;

        Bridge(int bridge_length, int weight){
            bridge = new Truck[bridge_length];
            this.bridge_length = bridge_length;
            this.weight = weight;
            this.truck_count = 0;
        }

        void addTruck(Truck truck){

            bridge[bridge_length-1] = truck;
            use_weight += truck.getTruck_weight();
            truck_count++;
            System.out.println("입장 truck = " + truck);
        }

        void Run(){
            if (truck_count == 0)
                return;

            for (int i = 0; i< bridge_length; i++) {
                if (i == 0 && bridge[i] != null) {
                    Truck truck = bridge[i];
                    use_weight -= truck.getTruck_weight();
                    bridge[i] = null;
                    truck_count--;
                    System.out.println("퇴장 truck = " + truck);
                }
                else if(i >= 1){
                    bridge[i-1] = bridge[i];
                    bridge[i] = null;
                }
            }
        }

        boolean checkAddTruck(Truck addTruck){
            if(weight >= use_weight + addTruck.getTruck_weight())
                return true;
            else
                return false;
        }

        int getTruckCount(){
            return this.truck_count;
        }

    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Bridge bridge = new Bridge(bridge_length, weight);
        Queue<Truck> queue = new ArrayDeque<>();
        int sec = 0;

        for (int truck_weight : truck_weights) {
            queue.add(new Truck(truck_weight));
        }

        while(!queue.isEmpty() || bridge.getTruckCount() >= 1){
            sec++;
            System.out.println("sec = " + sec);
            bridge.Run();

            if(!queue.isEmpty() && bridge.checkAddTruck(queue.peek())) {
                Truck truck = queue.poll();
                bridge.addTruck(truck);
            }
        }

        return sec;
    }
}
