package ch08;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(cat);
        list.add(dog);
    }
}
