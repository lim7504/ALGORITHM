package 인프런.섹션09_그리디;

import java.util.Scanner;

public class 문제01_씨름선수 {

    public static class Person {
        private int height;
        private int width;

        public Person(int height, int width) {
            this.height = height;
            this.width = width;
        }

    }

    private static int solution(Person[] array, int n) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] array = new Person[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            array[i] = new Person(height, width);
        }
        System.out.print(solution(array, n));
    }
}
