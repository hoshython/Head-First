package ch09;

public class SonOfBoo extends Boo {
    public SonOfBoo() {
        super("Boo");
    }

    public SonOfBoo(int i) {
        super("Fred");
    }

    public SonOfBoo(String s) {
        super(42);
    }

    public SonOfBoo(String s, int i) {
        super("Sam", 50);
    }
}
