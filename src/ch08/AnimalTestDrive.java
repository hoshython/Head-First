package ch08;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Object dog2 = new Dog();
        list.add(cat);
        list.add(dog);
//        does not work
//        dog2.bark();
        Dog dog3 = (Dog) dog2;  // casting
        dog3.bark();
        if (dog2 instanceof Dog) {
            Dog dog4 = (Dog) dog2;
            dog4.bark();
        }
        dog3.beFriendly();
        dog3.play();

        Object cat1 = new Cat();
        Cat cat2 = (Cat) cat1;
        cat2.beFriendly();
        cat2.play();
        cat2.mew();
    }
}
