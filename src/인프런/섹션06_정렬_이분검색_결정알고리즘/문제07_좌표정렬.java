package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.*;

public class 문제07_좌표정렬 {

    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }
    }

    private static List<Point> solution(int n, List<Point> list) {
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }
        for (Point point : solution(n, list)) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
