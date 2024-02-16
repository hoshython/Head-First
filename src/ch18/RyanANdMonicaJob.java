package ch18;

public class RyanANdMonicaJob implements Runnable {
    private final String name;
    private final BankAccount account;
    private final int amount;
    public RyanANdMonicaJob(String name, BankAccount account, int amount) {
        this.name = name;
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        goShopping(name, amount);
    }
    private void goShopping(String name, int amount) {
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(name + " is about to spend $" + amount);
                account.spend(name, amount);
                System.out.println(name + " finishes spending $" + amount);
                System.out.println("Current balance is: $" + account.getBalance());
            } else {
                System.out.println("Sorry, not enough for " + name);
                System.out.println("Current balance is: $" + account.getBalance());
            }
        }
    }
}
