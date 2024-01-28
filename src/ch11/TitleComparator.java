package ch11;

import java.util.Comparator;

public class TitleComparator implements Comparator<SongV3> {
    @Override
    public int compare(SongV3 s1, SongV3 s2) {
        return s1.getTitle().compareTo(s2.getTitle());
    }
}
