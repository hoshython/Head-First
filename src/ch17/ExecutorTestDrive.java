package ch17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {
    private static int counter = 100;
    public static void main(String[] args) {
        while (counter > 0) {
            try (ExecutorService executor = Executors.newSingleThreadExecutor()) {

                executor.execute(() -> System.out.println("top of the stack"));
                // System.out.println("back in main()");
                try {
                    Thread.sleep(10);
                    System.out.println("back in main()");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                executor.shutdown();
            }
            counter--;
        }
    }
}
