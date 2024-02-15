package ch17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> System.out.println("top of the stack"));
        // System.out.println("back in main()");
        try {
            Thread.sleep(1);
            System.out.println("back in main()");
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
