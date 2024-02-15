package ch17;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * PredictableLatch
 */
class PredictableLatch {
    private static int counter = 100;
    public static void main(String[] args) {
        while (counter > 0) {
            try (ExecutorService executor = Executors.newSingleThreadExecutor()) {
                CountDownLatch latch = new CountDownLatch(1);

                executor.execute(() -> waitForLatchThenPrint(latch));

                System.out.println("back in main");
                latch.countDown();

                executor.shutdown();
            }
            counter--;
        }
    }

    private static void waitForLatchThenPrint(@NotNull CountDownLatch latch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("top of the stack");
    }
}
