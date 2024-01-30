package ch11;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvenienceFactoryMethods {
    public static void main(String[] args) {
        List<SongV4> songList = List.of(new SongV4("Razyana", "Hasan Zirak", 72),
                new SongV4("Aroom", "Arash", 20));
        System.out.println(songList);

        Set<String> nameSet = Set.of("Ali", "Abbas", "Iman");
        System.out.println(nameSet);

        Map<String, Integer> scores = Map.of("Iman", 20,
                "Razi", 32,
                "Aziz", 46);
        System.out.println(scores);

        Map<String, String> trucks = Map.ofEntries(Map.entry("Volvo", "FM"),
                Map.entry("Benz", "Axor"),
                Map.entry("Scania", "R410"));
        System.out.println(trucks);
    }
}
