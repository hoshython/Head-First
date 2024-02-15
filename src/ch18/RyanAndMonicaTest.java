package ch18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RyanAndMonicaTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        RyanANdMonicaJob ryan = new RyanANdMonicaJob("Ryan", account, 50);
        RyanANdMonicaJob monica = new RyanANdMonicaJob("Monica", account, 100);


        try(ExecutorService executor = Executors.newFixedThreadPool(2)) {
            executor.execute(ryan);
            executor.execute(monica);
            executor.shutdown();
        }
    }
}
