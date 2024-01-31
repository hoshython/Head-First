package ch12;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Green", "Blue");
/*
        for (String color : colors){
            System.out.println(color);
        }
*/
        colors.forEach(color -> System.out.println(color));
    }
}
