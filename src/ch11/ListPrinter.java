package ch11;

import java.util.List;

public class ListPrinter {
    public ListPrinter(String s, List<SongV3> list) {
        System.out.println(s + ":");
        System.out.printf("\t%s%n%n", list);
    }
}
