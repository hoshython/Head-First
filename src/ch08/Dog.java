package ch08;

public class Dog extends Animal implements Pet {
    public static void bark() {
        System.out.println("Hup! Hup!");
    }
    
    @Override public void beFriendly() {
        System.out.println("I am A friendly dog");
    }
    
    @Override public void play() {
        System.out.println("I fetch things");
    }
}
