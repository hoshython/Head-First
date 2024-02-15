package ch18;

public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }
    public void spend(int amount){
        balance = amount - balance;
        if (balance < 0) {
            System.out.println("Overdrawn!");
        }
    }
}
