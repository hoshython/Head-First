package ch12;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrder {
    public static void main(String[] args) {
        List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha", "Cappuccino", "Flat White", "Latte");
        List<String> coffeesEndingInO = coffees.stream().filter((s) -> {
            return s.endsWith("o");
        }).distinct().sorted().collect(Collectors.toUnmodifiableList());
        System.out.println(coffeesEndingInO);
    }
}
