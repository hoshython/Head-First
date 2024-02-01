package ch12;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        //        Stream<String> stream = strings.stream();
        //        Stream<String> limit = stream.limit(4); // 4 is the maximum number of element we want
        //        System.out.println(limit.count());
        //        System.out.println(limit.collect(Collectors.toList()));

        List<String> result = strings.stream().limit(4).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(strings.stream().sorted().limit(4).collect(Collectors.toList()));
        System.out.println(strings.stream().sorted(String::compareToIgnoreCase).limit(4).collect(Collectors.toList()));
        System.out.println(
                strings.stream().sorted(String::compareToIgnoreCase).skip(2).limit(4).collect(Collectors.toList()));
        System.out.println(strings.stream().collect(Collectors.joining(", ")));
    }
}
