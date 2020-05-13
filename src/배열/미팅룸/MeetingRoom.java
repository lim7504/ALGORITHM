package 배열.미팅룸;

import java.util.ArrayList;
import java.util.List;


public class MeetingRoom {

    int start;
    int end;

    public MeetingRoom(int start, int end){
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {

        List<MeetingRoom> timeList = new ArrayList<>();
        timeList.add(new MeetingRoom(15,20));
        timeList.add(new MeetingRoom(5,10));
        timeList.add(new MeetingRoom(0,30));
        timeList.sort((t1, t2) -> { return t1.start - t2.start;});

        for(int i=0; i<timeList.size() -1 ; i++){
            if(timeList.get(i).end > timeList.get(i+1).start) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
