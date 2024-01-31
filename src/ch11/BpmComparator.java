package ch11;

import java.util.Comparator;

public class BpmComparator implements Comparator<SongV3> {
    @Override public int compare(SongV3 s1, SongV3 s2) {
        return Integer.compare(s1.getBpm(), s2.getBpm());
    }
}
