package ch08;

public class Cat extends Animal implements Pet {
    public static void mew() {
        System.out.println("Mew!");
    }
    
    @Override public void beFriendly() {
        System.out.println("I am a friendly cat");
    }
    
    @Override public void play() {
        System.out.println("I want to play play with a ball");
    }
}
