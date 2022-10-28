package 인프런.섹션05_스택_큐_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 문제03_크레인인형뽑기 {

    private static int solution(int n, int[][] board, int m, int[] moves) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : moves) {
            for (int j = 0; j < n; j++) {
                if (board[j][i - 1] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[j][i - 1]) {
                        stack.pop();
                        result += 2;
                    } else {
                        stack.push(board[j][i - 1]);
                    }
                    board[j][i - 1] = 0;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.print(solution(n, board, m, moves));
    }
}
