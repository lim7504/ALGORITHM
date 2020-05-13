package 해쉬.베스트앨범_해쉬문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] solution = s.solution(genres, plays);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    class Album implements Comparable<Album> {

        String music;
        Integer play;
        Integer no;

        public Album(Integer no, String music, Integer play){
            this.music = music;
            this.play = play;
            this.no = no;
        }

        public Album(String music, Integer play){
            this.music = music;
            this.play = play;
        }

        @Override
        public int compareTo(Album album) {
            if(this.play < album.play)
                return 1;
            else if(this.play.equals(album.play))
                if(this.no > album.no)
                    return 1;
                else if (this.no.equals(album.no))
                    return 0;
                else
                    return -1;
            else
                return -1;
        }
    }


    public int[] solution(String[] genres, int[] plays) {
        List<Album> albumList = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            albumList.add(new Album(i, genres[i], plays[i]));
        }
        Collections.sort(albumList);


        HashMap<String, Integer> map = new HashMap<>();
        for (Album album : albumList) {
            map.put(album.music, map.getOrDefault(album.music,0) + album.play);
        }


        List<Album> orderList = new ArrayList<>();
        for (String key : map.keySet())
            orderList.add(new Album(key, map.get(key)));

        orderList.sort((album1, album2) -> {
            if(album1.play < album2.play)
                return 1;
            else if (album1.play == album2.play)
                return 0;
            else
                return -1;
        });


//        for (Album album : albumList) {
//            System.out.println("album = " + album.no + " " + album.music + album.play);
//        }

        List<Integer> answerList = new ArrayList<>();

        for (Album order : orderList) {
             int cnt = 0;
            for (Album album : albumList) {
                if(order.music.equals(album.music)) {
                    answerList.add(album.no);
                     cnt++;

                     if(cnt == 2)
                         break;
                }
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }
}