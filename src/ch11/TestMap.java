package ch11;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Razi", 40);
        scores.put("Iman", 32);
        scores.put("Hamed", 36);
        System.out.println(scores);
        System.out.println(scores.get("Razi"));
    }
}
