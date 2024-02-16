package ch18;

import java.util.concurrent.atomic.AtomicInteger;

public class Balance {
    AtomicInteger balance = new AtomicInteger(-10);
    public void increment() {
//        synchronized (this) {
//            balance++;
//        }
        balance.incrementAndGet();
    }
}