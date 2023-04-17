package 인프런.섹션06_정렬_이분검색_결정알고리즘;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {

    public static void main(String[] args) {
        CompletableFuture future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch(Exception e) {
                e.printStackTrace();
            }

            System.out.println("future1 Completed!");
            return "Hello";
        });

        CompletableFuture future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                e.printStackTrace();
            }

            System.out.println("future2 Completed!");
            return "Beautiful";
        });

        CompletableFuture future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1500);
            } catch(Exception e) {
                e.printStackTrace();
            }

            System.out.println("future3 Completed!");
            return "World";
        });

        CompletableFuture combinedFuture = CompletableFuture.allOf(future1, future2, future3);
        CompletableFuture combinedFuture2 = CompletableFuture.allOf(future1, future2, future3);
        System.out.println("CompletableFuture.allOf Test");

        try {
            combinedFuture.get();
            String o = (String) future1.get();
            System.out.println("o = " + o);
            System.out.println("All futures Completed!");
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            combinedFuture2.get();
            String o = (String) future1.get();
            System.out.println("o = " + o);
            System.out.println("All futures Completed!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
