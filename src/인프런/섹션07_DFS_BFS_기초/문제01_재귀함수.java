package 인프런.섹션07_DFS_BFS_기초;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 문제01_재귀함수 {

    private static void DFS(List<Integer> list, int n) {
        if (n == 0) {
            return;
        }
        DFS(list, n - 1);
        list.add(n);
    }

    private static List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        DFS(list, n);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i : solution(n)) {
            System.out.println(i);
        }
    }
}
