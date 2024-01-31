package ch11;

import java.util.List;

public class TestGenerics1 {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Animal(), new Dog(), new Cat());
        takeAnimals(animals);
        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimals(dogs);
    }
    
    //    public static void takeAnimals(List<? extends Animal> animals){
    public static <T extends Animal> void takeAnimals(List<T> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
