package ch09;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(42);
        Hippo h = new Hippo("Buffy");
        System.out.println(h.getName());

        SonOfBoo son = new SonOfBoo();
    }
}
